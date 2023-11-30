package com.exmaple.pluginname.platforms;

import com.exmaple.pluginname.Example;
import com.exmaple.pluginname.ExamplePlugin;

import dev.neuralnexus.taterlib.logger.LoggerAdapter;

import net.md_5.bungee.api.plugin.Plugin;

/** Bungee entry point. */
public class BungeePlugin extends Plugin implements ExamplePlugin {
    public BungeePlugin() {
        pluginStart(this, new LoggerAdapter(Example.Constants.PROJECT_NAME, getLogger()));
    }
}
