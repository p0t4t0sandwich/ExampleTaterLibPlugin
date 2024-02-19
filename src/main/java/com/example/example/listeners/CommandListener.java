package com.example.example.listeners;

import com.example.example.Example;
import com.example.example.commands.ExampleCommand;

import dev.neuralnexus.taterlib.command.Command;
import dev.neuralnexus.taterlib.event.command.BrigadierCommandRegisterEvent;
import dev.neuralnexus.taterlib.event.command.CommandRegisterEvent;

/** The command listener. */
public class CommandListener {
    /**
     * Called when commands are being registered.
     *
     * @param event The event.
     */
    public static void onRegisterCommand(CommandRegisterEvent event) {
        //        event.registerCommand(Example.plugin(), new ExampleCommand(), "alias1",
        // "alias2");
    }

    /**
     * Called when brigadier commands are being registered.
     *
     * @param event The event.
     */
    public static void onRegisterBrigadierCommand(BrigadierCommandRegisterEvent event) {
        Command command = new ExampleCommand();
        BrigadierHelperClass.onRegisterBrigadierCommand(
                event, command, Example.plugin(), command.name(), "ex", "alias2");
    }
}
