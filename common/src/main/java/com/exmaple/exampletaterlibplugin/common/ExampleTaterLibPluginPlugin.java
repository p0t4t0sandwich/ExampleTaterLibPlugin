package com.exmaple.exampletaterlibplugin.common;

import dev.neuralnexus.taterlib.common.Plugin;
import dev.neuralnexus.taterlib.common.TaterLib;
import dev.neuralnexus.taterlib.common.logger.AbstractLogger;

/**
 * The main plugin interface.
 */
public interface ExampleTaterLibPluginPlugin extends Plugin {
    /**
     * Starts the plugin.
     */
    default void pluginStart(Plugin plugin, AbstractLogger logger) {
        try {
            ExampleTaterLibPlugin.start(plugin, logger);
            ExampleTaterLibPlugin.logger.info(Constants.PROJECT_NAME + " is running on " + TaterLib.serverType + " " + TaterLib.minecraftVersion + "!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Stops the plugin.
     */
    default void pluginStop() {
        try {
            ExampleTaterLibPlugin.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
