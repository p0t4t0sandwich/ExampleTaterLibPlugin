package com.exmaple.pluginname.bungee;

import com.exmaple.pluginname.common.ExamplePlugin;

import dev.neuralnexus.taterlib.bungee.logger.BungeeLogger;

import net.md_5.bungee.api.plugin.Plugin;

/** Bungee entry point. */
public class BungeePlugin extends Plugin implements ExamplePlugin {
    public BungeePlugin() {
        pluginStart(this, new BungeeLogger(getLogger()));
    }
}
