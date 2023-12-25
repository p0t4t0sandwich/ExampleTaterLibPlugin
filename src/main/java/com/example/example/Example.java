package com.example.example;

import com.example.example.api.ExampleAPI;
import com.example.example.api.ExampleAPIProvider;
import com.example.example.listeners.CommandListener;

import dev.neuralnexus.taterlib.api.TaterAPIProvider;
import dev.neuralnexus.taterlib.event.api.CommandEvents;
import dev.neuralnexus.taterlib.logger.AbstractLogger;

/** Main class for the plugin. */
public class Example {
    private static boolean STARTED = false;
    private static boolean RELOADED = false;
    private static Object plugin;
    private static AbstractLogger logger;

    /**
     * Get the plugin
     *
     * @return The plugin
     */
    public static Object getPlugin() {
        return plugin;
    }

    /**
     * Set the plugin
     *
     * @param plugin The plugin
     */
    private static void setPlugin(Object plugin) {
        Example.plugin = plugin;
    }

    /**
     * Get the logger
     *
     * @return The logger
     */
    public static AbstractLogger getLogger() {
        return logger;
    }

    /**
     * Set the logger
     *
     * @param logger The logger
     */
    private static void setLogger(AbstractLogger logger) {
        Example.logger = logger;
    }

    /**
     * Start
     *
     * @param plugin The plugin
     * @param logger The logger
     */
    public static void start(Object plugin, AbstractLogger logger) {
        setPlugin(plugin);
        setLogger(logger);

        // Config
        ExampleConfig.loadConfig(TaterAPIProvider.get().configFolder());

        if (STARTED) {
            logger.info(Constants.PROJECT_NAME + " has already started!");
            return;
        }
        STARTED = true;

        if (!RELOADED) {
            // Register listeners
            // CommandEvents.REGISTER_COMMAND.register(CommandListener::onRegisterCommand);
            CommandEvents.REGISTER_BRIGADIER_COMMAND.register(
                    CommandListener::onRegisterBrigadierCommand);
        }

        ExampleAPIProvider.register(new ExampleAPI("someData"));

        logger.info(Constants.PROJECT_NAME + " has been started!");
    }

    /** Stop */
    public static void stop() {
        if (!STARTED) {
            logger.info(Constants.PROJECT_NAME + " has already stopped!");
            return;
        }
        STARTED = false;

        // Remove references to objects
        ExampleConfig.unloadConfig();

        logger.info(Constants.PROJECT_NAME + " has been stopped!");
    }

    /** Reload */
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

    /** Constants used throughout the plugin. */
    public static class Constants {
        public static final String PROJECT_NAME = "Example";
        public static final String PROJECT_ID = "example";
        public static final String PROJECT_VERSION = "0.1.0-R0.1-SNAPSHOT";
        public static final String PROJECT_AUTHORS = "yournamehere";
        public static final String PROJECT_DESCRIPTION = "A cross-API plugin that uses TaterLib!";
        public static final String PROJECT_URL = "https://github.com/yournamehere/Example";
    }
}
