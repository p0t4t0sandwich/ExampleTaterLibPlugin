package com.exmaple.pluginname.common;

import dev.neuralnexus.taterlib.common.Plugin;
import dev.neuralnexus.taterlib.common.api.TaterAPIProvider;
import dev.neuralnexus.taterlib.common.logger.AbstractLogger;

/**
 * The main plugin interface.
 */
public interface ExamplePlugin extends Plugin {
    /**
     * Starts the plugin.
     */
    default void pluginStart(Object plugin, AbstractLogger logger) {
        Example.getLogger().info(Example.Constants.PROJECT_NAME + " is running on " + TaterAPIProvider.get().serverType() + " " + TaterAPIProvider.get().minecraftVersion() + "!");
        Example.start(plugin, logger);
    }

    /**
     * Stops the plugin.
     */
    default void pluginStop() {
        Example.stop();
    }
}
