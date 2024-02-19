package com.example.example.platforms;

import com.example.example.Example;
import com.example.example.ExamplePlugin;
import com.google.inject.Inject;

import dev.neuralnexus.taterlib.logger.LoggerAdapter;

import org.apache.logging.log4j.Logger;
import org.spongepowered.plugin.PluginContainer;
import org.spongepowered.plugin.builtin.jvm.Plugin;

/** Sponge entry point. */
@Plugin(Example.Constants.PROJECT_ID)
public class Sponge8Plugin implements ExamplePlugin {
    @Inject
    public Sponge8Plugin(PluginContainer container, Logger logger) {
        pluginStart(
                container, null, logger, new LoggerAdapter(Example.Constants.PROJECT_NAME, logger));
    }
}
