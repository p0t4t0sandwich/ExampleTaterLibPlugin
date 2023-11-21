package com.exmaple.pluginname.common;

import dev.neuralnexus.taterlib.lib.dejvokep.boostedyaml.YamlDocument;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/** Config handler. */
public class ExampleConfig {
    private static YamlDocument config;

    /**
     * Load the config
     *
     * @param configFolder The path to the config file
     */
    public static void loadConfig(String configFolder) {
        try {
            config =
                    YamlDocument.create(
                            new File(
                                    "."
                                            + File.separator
                                            + configFolder
                                            + File.separator
                                            + Example.Constants.PROJECT_NAME,
                                    Example.Constants.PROJECT_ID + ".config.yml"),
                            Objects.requireNonNull(
                                    Example.class
                                            .getClassLoader()
                                            .getResourceAsStream(
                                                    Example.Constants.PROJECT_ID + ".config.yml")));
            config.reload();
        } catch (IOException | NullPointerException e) {
            Example.getLogger()
                    .info(
                            "Failed to load "
                                    + Example.Constants.PROJECT_ID
                                    + ".config.yml!\n"
                                    + e.getMessage());
            e.printStackTrace();
        }
    }

    /** Unload the config */
    public static void unloadConfig() {
        config = null;
    }

    /** Save the config */
    public static void saveConfig() {
        try {
            config.save();
        } catch (IOException e) {
            Example.getLogger()
                    .info(
                            "Failed to save "
                                    + Example.Constants.PROJECT_ID
                                    + ".config.ymll!\n"
                                    + e.getMessage());
        }
    }
}
