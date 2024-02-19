package com.example.example;

import dev.neuralnexus.taterlib.api.TaterAPIProvider;
import dev.neuralnexus.taterlib.event.api.PluginEvents;
import dev.neuralnexus.taterlib.logger.AbstractLogger;
import dev.neuralnexus.taterlib.plugin.Plugin;

/** The main plugin interface. */
public interface ExamplePlugin extends Plugin {
    @Override
    default String name() {
        return Example.Constants.PROJECT_NAME;
    }

    @Override
    default String id() {
        return Example.Constants.PROJECT_ID;
    }

    @Override
    default void pluginStart(
            Object plugin, Object pluginServer, Object pluginLogger, AbstractLogger logger) {
        logger.info(
                Example.Constants.PROJECT_NAME
                        + " is running on "
                        + TaterAPIProvider.serverType()
                        + " "
                        + TaterAPIProvider.minecraftVersion()
                        + "!");
        PluginEvents.DISABLED.register(event -> pluginStop());
        Example.start(plugin, pluginServer, pluginLogger, logger);
    }

    @Override
    default void pluginStop() {
        Example.stop();
    }
}
