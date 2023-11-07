package com.exmaple.pluginname.sponge;

import com.exmaple.pluginname.common.Example;
import dev.neuralnexus.taterlib.common.event.api.ServerEvents;
import dev.neuralnexus.taterlib.sponge.logger.SpongeLogger;
import com.exmaple.pluginname.common.ExamplePlugin;
import org.spongepowered.plugin.PluginContainer;
import org.spongepowered.plugin.builtin.jvm.Plugin;
import com.google.inject.Inject;
import org.apache.logging.log4j.Logger;

/**
 * Sponge entry point.
 */
@Plugin(Example.Constants.PROJECT_ID)
public class SpongePlugin implements ExamplePlugin {
    @Inject
    public SpongePlugin(PluginContainer container, Logger logger) {
        ServerEvents.STOPPED.register(event -> pluginStop());
        pluginStart(container, new SpongeLogger(logger));
    }
}
