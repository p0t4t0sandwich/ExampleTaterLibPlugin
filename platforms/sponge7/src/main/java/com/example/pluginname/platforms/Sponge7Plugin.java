package com.example.pluginname.platforms;

import com.example.pluginname.Example;
import com.example.pluginname.ExamplePlugin;
import com.google.inject.Inject;

import dev.neuralnexus.taterlib.logger.LoggerAdapter;

import org.slf4j.Logger;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;

/** Sponge entry point. */
@Plugin(
        id = Example.Constants.PROJECT_ID,
        name = Example.Constants.PROJECT_NAME,
        version = Example.Constants.PROJECT_VERSION,
        description = Example.Constants.PROJECT_DESCRIPTION)
public class Sponge7Plugin implements ExamplePlugin {
    @Inject
    public Sponge7Plugin(PluginContainer container, Logger logger) {
        pluginStart(container, new LoggerAdapter(Example.Constants.PROJECT_NAME, logger));
    }
}
