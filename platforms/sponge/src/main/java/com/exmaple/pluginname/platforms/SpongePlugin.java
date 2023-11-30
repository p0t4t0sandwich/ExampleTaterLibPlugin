package com.exmaple.pluginname.platforms;

import com.exmaple.pluginname.Example;
import com.exmaple.pluginname.ExamplePlugin;
import com.google.inject.Inject;

import dev.neuralnexus.taterlib.logger.LoggerAdapter;

import org.apache.logging.log4j.Logger;
import org.spongepowered.plugin.PluginContainer;
import org.spongepowered.plugin.builtin.jvm.Plugin;

/** Sponge entry point. */
@Plugin(Example.Constants.PROJECT_ID)
public class SpongePlugin implements ExamplePlugin {
    @Inject
    public SpongePlugin(PluginContainer container, Logger logger) {
        pluginStart(container, new LoggerAdapter(Example.Constants.PROJECT_NAME, logger));
    }
}
