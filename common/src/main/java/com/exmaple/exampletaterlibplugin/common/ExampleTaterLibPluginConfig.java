package com.exmaple.exampletaterlibplugin.common;

import dev.neuralnexus.taterlib.lib.dejvokep.boostedyaml.YamlDocument;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * Config handler.
 */
public class ExampleTaterLibPluginConfig {
    private static YamlDocument config;

    /**
     * Load the config
     * @param configFolder The path to the config file
     */
    public static void loadConfig(String configFolder) {
        try {
            config = YamlDocument.create(new File("." + File.separator + configFolder + File.separator + Constants.PROJECT_NAME, Constants.PROJECT_ID + ".config.yml"),
                    Objects.requireNonNull(ExampleTaterLibPlugin.class.getClassLoader().getResourceAsStream(Constants.PROJECT_ID + ".config.yml"))
            );
            config.reload();
        } catch (IOException | NullPointerException e) {
            ExampleTaterLibPlugin.logger.info("Failed to load " + Constants.PROJECT_ID + ".config.yml!\n" + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Unload the config
     */
    public static void unloadConfig() {
        config = null;
    }

    /**
     * Save the config
     */
    public static void saveConfig() {
        try {
            config.save();
        } catch (IOException e) {
            ExampleTaterLibPlugin.logger.info("Failed to save " + Constants.PROJECT_ID + ".config.ymll!\n" + e.getMessage());
        }
    }
}
