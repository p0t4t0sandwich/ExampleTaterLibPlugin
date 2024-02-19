package com.example.example;

import com.example.example.api.ExampleAPI;
import com.example.example.api.ExampleAPIProvider;
import com.example.example.listeners.CommandListener;

import dev.neuralnexus.taterlib.api.TaterAPIProvider;
import dev.neuralnexus.taterlib.api.info.ServerType;
import dev.neuralnexus.taterlib.bstats.MetricsAdapter;
import dev.neuralnexus.taterlib.event.api.CommandEvents;
import dev.neuralnexus.taterlib.logger.AbstractLogger;

/** Main class for the plugin. */
public class Example {
    private static final Example instance = new Example();
    private static boolean STARTED = false;
    private static boolean RELOADED = false;
    private Object plugin;
    private Object pluginServer;
    private Object pluginLogger;
    private AbstractLogger logger;

    /**
     * Getter for the singleton instance of the class.
     *
     * @return The singleton instance
     */
    public static Example instance() {
        return instance;
    }

    /**
     * Get the plugin
     *
     * @return The plugin
     */
    public static Object plugin() {
        return instance.plugin;
    }

    /**
     * Set the plugin
     *
     * @param plugin The plugin
     */
    private static void setPlugin(Object plugin) {
        instance.plugin = plugin;
    }

    /**
     * Set the plugin server
     *
     * @param pluginServer The plugin server
     */
    private static void setPluginServer(Object pluginServer) {
        instance.pluginServer = pluginServer;
    }

    /**
     * Set the plugin logger
     *
     * @param pluginLogger The plugin logger
     */
    private static void setPluginLogger(Object pluginLogger) {
        instance.pluginLogger = pluginLogger;
    }

    /**
     * Get the logger
     *
     * @return The logger
     */
    public static AbstractLogger logger() {
        return instance.logger;
    }

    /**
     * Set the logger
     *
     * @param logger The logger
     */
    private static void setLogger(AbstractLogger logger) {
        instance.logger = logger;
    }

    /**
     * Start
     *
     * @param plugin The plugin
     * @param pluginServer The plugin server
     * @param pluginLogger The plugin logger
     * @param logger The logger
     */
    public static void start(
            Object plugin, Object pluginServer, Object pluginLogger, AbstractLogger logger) {
        if (pluginServer != null) {
            setPluginServer(pluginServer);
        }
        if (pluginLogger != null) {
            setPluginLogger(pluginLogger);
        }
        setPlugin(plugin);
        setLogger(logger);

        // Set up bStats
        MetricsAdapter.setupMetrics(
                plugin,
                pluginServer,
                pluginLogger,
                ImmutableMap.<ServerType, Integer>builder()
                        .put(ServerType.BUKKIT, 21038)
                        .put(ServerType.BUNGEECORD, 21039)
                        .put(ServerType.SPONGE, 21040)
                        .put(ServerType.VELOCITY, 21041)
                        .build());

        // Config
        ExampleConfig.loadConfig(TaterAPIProvider.serverType().dataFolders().configFolder());

        if (STARTED) {
            instance.logger.info(Constants.PROJECT_NAME + " has already started!");
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

        instance.logger.info(Constants.PROJECT_NAME + " has been started!");
    }

    /** Stop */
    public static void stop() {
        if (!STARTED) {
            instance.logger.info(Constants.PROJECT_NAME + " has already stopped!");
            return;
        }
        STARTED = false;

        // Remove references to objects
        ExampleConfig.unloadConfig();

        instance.logger.info(Constants.PROJECT_NAME + " has been stopped!");
    }

    /** Start */
    public static void start() {
        start(instance.plugin, instance.pluginServer, instance.pluginLogger, instance.logger);
    }

    /** Reload */
    public static void reload() {
        if (!STARTED) {
            instance.logger.info(Constants.PROJECT_NAME + " has not been started!");
            return;
        }
        RELOADED = true;

        // Stop
        stop();

        // Start
        start();

        instance.logger.info(Constants.PROJECT_NAME + " has been reloaded!");
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
