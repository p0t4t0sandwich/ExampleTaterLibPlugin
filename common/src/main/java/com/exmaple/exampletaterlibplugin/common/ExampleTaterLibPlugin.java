package com.exmaple.exampletaterlibplugin.common;

import dev.neuralnexus.taterlib.common.Plugin;
import dev.neuralnexus.taterlib.common.TaterLib;
import dev.neuralnexus.taterlib.common.logger.AbstractLogger;

/**
 * Main class for the plugin.
 */
public class ExampleTaterLibPlugin {
    private static Plugin plugin;
    public static AbstractLogger logger;
    private static boolean STARTED = false;
    private static boolean RELOADED = false;

    /**
     * Start
     * @param plugin The plugin
     * @param logger The logger
     */
    public static void start(Plugin plugin, AbstractLogger logger) {
        ExampleTaterLibPlugin.plugin = plugin;
        ExampleTaterLibPlugin.logger = logger;

        // Config
        ExampleTaterLibPluginConfig.loadConfig(TaterLib.configFolder);

        if (STARTED) {
            logger.info(Constants.PROJECT_NAME + " has already started!");
            return;
        }
        STARTED = true;

        if (!RELOADED) {
            // Register events
        }

        logger.info(Constants.PROJECT_NAME + " has been started!");
    }

    /**
     * Start
     */
    public static void start() {
        start(plugin, logger);
    }

    /**
     * Stop
     */
    public static void stop() {
        if (!STARTED) {
            logger.info(Constants.PROJECT_NAME + " has already stopped!");
            return;
        }
        STARTED = false;

        // Remove references to objects
        ExampleTaterLibPluginConfig.unloadConfig();

        logger.info(Constants.PROJECT_NAME + " has been stopped!");
    }

    /**
     * Reload
     */
    public static void reload() {
        if (!STARTED) {
            logger.info(Constants.PROJECT_NAME + " has not been started!");
            return;
        }
        RELOADED = true;

        // Stop
        stop();

        // Start
        start(plugin, logger);

        logger.info(Constants.PROJECT_NAME + " has been reloaded!");
    }
}
