package com.example.example.listeners;

import static com.mojang.brigadier.arguments.StringArgumentType.greedyString;
import static com.mojang.brigadier.builder.LiteralArgumentBuilder.literal;
import static com.mojang.brigadier.builder.RequiredArgumentBuilder.argument;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

import dev.neuralnexus.taterlib.api.TaterAPIProvider;
import dev.neuralnexus.taterlib.command.Command;
import dev.neuralnexus.taterlib.command.CommandSender;
import dev.neuralnexus.taterlib.event.command.BrigadierCommandRegisterEvent;

/** Helper class for brigadier commands (prevents ClassNotFound exceptions). */
public class BrigadierHelperClass {
    @SuppressWarnings("unchecked")
    public static void onRegisterBrigadierCommand(
            BrigadierCommandRegisterEvent event,
            Command command,
            Object plugin,
            String commandName,
            String... aliases) {

        // Create your command
        LiteralArgumentBuilder brigCommand = literal(command.name());

        // Add permission check and any other required logic (e.g. player check or dimension check)
        brigCommand.requires(
                source -> {
                    CommandSender sender = event.getSender(source);
                    return sender.hasPermission(
                            // Checks if not dedicated, or if LuckPerms is installed
                            // then sets the permission level to 0, otherwise 4
                            event.isDedicated()
                                    ? (TaterAPIProvider.isHooked("luckperms") ? 0 : 4)
                                    : 0);
                });

        // Create an argument for the command, for this example we will use
        // a greedy string that we can split into an array.
        RequiredArgumentBuilder<Object, String> requiredArgument = argument("args", greedyString());
        requiredArgument.executes(
                context -> {
                    try {
                        Object source = context.getSource();
                        CommandSender sender = event.getSender(source);

                        String[] args = context.getArgument("args", String.class).split(" ");
                        boolean isPlayer = event.isPlayer(source);
                        if (isPlayer) {
                            sender = event.getPlayer(source);
                        }
                        return command.execute(sender, command.name(), args) ? 1 : 0;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return 0;
                    }
                });

        // Add the argument to the command
        brigCommand.then(requiredArgument);

        // Register the command
        event.registerCommand(brigCommand, plugin, commandName, aliases);
    }
}
