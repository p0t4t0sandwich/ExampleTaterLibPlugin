package com.exmaple.pluginname.common.listeners;

import dev.neuralnexus.taterlib.common.event.command.BrigadierCommandRegisterEvent;
import dev.neuralnexus.taterlib.common.event.command.CommandRegisterEvent;
import dev.neuralnexus.taterlib.common.listeners.command.BrigadierHelperClass;

/**
 * The command listener.
 */
public class CommandListener {
    /**
     * Called when commands are being registered.
     * @param event The event.
     */
    public static void onRegisterCommand(CommandRegisterEvent event) {
//        event.registerCommand(TaterLib.getPlugin(), new TaterLibCommand());
    }

    /**
     * Called when brigadier commands are being registered.
     * @param event The event.
     */
    public static void onRegisterBrigadierCommand(BrigadierCommandRegisterEvent event) {
        BrigadierHelperClass.onRegisterBrigadierCommand(event);
    }
}
