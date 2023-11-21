package com.exmaple.pluginname.common.listeners;

import com.exmaple.pluginname.common.Example;
import com.exmaple.pluginname.common.commands.ExampleCommand;

import dev.neuralnexus.taterlib.common.command.Command;
import dev.neuralnexus.taterlib.common.event.command.BrigadierCommandRegisterEvent;
import dev.neuralnexus.taterlib.common.event.command.CommandRegisterEvent;

/** The command listener. */
public class CommandListener {
    /**
     * Called when commands are being registered.
     *
     * @param event The event.
     */
    public static void onRegisterCommand(CommandRegisterEvent event) {
        //        event.registerCommand(Example.getPlugin(), new ExampleCommand(), "alias1",
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
                event, command, Example.getPlugin(), command.getName(), "alias1", "alias2");
    }
}
