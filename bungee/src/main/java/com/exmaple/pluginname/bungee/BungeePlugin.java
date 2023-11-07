package com.exmaple.pluginname.bungee;

import dev.neuralnexus.taterlib.bungee.logger.BungeeLogger;
import com.exmaple.pluginname.common.ExamplePlugin;
import dev.neuralnexus.taterlib.common.event.api.ServerEvents;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * Bungee entry point.
 */
public class BungeePlugin extends Plugin implements ExamplePlugin {
    public BungeePlugin() {
        ServerEvents.STOPPED.register(event -> pluginStop());
        pluginStart(this, new BungeeLogger(getLogger()));
    }
}
