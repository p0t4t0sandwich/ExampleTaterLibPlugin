package com.example.example.commands;

import com.example.example.api.ExampleAPIProvider;

import dev.neuralnexus.taterlib.Utils;
import dev.neuralnexus.taterlib.command.Command;
import dev.neuralnexus.taterlib.command.CommandSender;
import dev.neuralnexus.taterlib.player.Player;

/** Example Command. */
public class ExampleCommand implements Command {
    private String name = "example";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return "Example command";
    }

    @Override
    public String getUsage() {
        return "/example";
    }

    @Override
    public String getPermission() {
        return "example.command.example";
    }

    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        if (!sender.hasPermission(getPermission())) {
            sender.sendMessage(
                    Utils.substituteSectionSign(
                            "&cYou do not have permission to execute this command!"));
            return true;
        }
        if (!(sender instanceof Player)) {
            sender.sendMessage(
                    Utils.substituteSectionSign(
                            "&cThis command can only be executed by a player!"));
            return true;
        }

        sender.sendMessage(Utils.substituteSectionSign(ExampleAPIProvider.get().getSomeData()));
        return true;
    }
}
