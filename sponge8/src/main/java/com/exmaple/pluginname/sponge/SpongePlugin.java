package com.exmaple.pluginname.sponge;

import com.exmaple.pluginname.common.Example;
import com.exmaple.pluginname.common.ExamplePlugin;
import com.google.inject.Inject;

import dev.neuralnexus.taterlib.sponge.logger.SpongeLogger;

import org.apache.logging.log4j.Logger;
import org.spongepowered.plugin.PluginContainer;
import org.spongepowered.plugin.builtin.jvm.Plugin;

/** Sponge entry point. */
@Plugin(Example.Constants.PROJECT_ID)
public class SpongePlugin implements ExamplePlugin {
    @Inject
    public SpongePlugin(PluginContainer container, Logger logger) {
        pluginStart(container, new SpongeLogger(logger));
    }
}
