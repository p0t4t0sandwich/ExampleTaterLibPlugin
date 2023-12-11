package com.example.pluginname.platforms;

import com.example.pluginname.Example;
import com.example.pluginname.ExamplePlugin;

import dev.neuralnexus.taterlib.logger.LoggerAdapter;

import net.md_5.bungee.api.plugin.Plugin;

/** Bungee entry point. */
public class BungeePlugin extends Plugin implements ExamplePlugin {
    public BungeePlugin() {
        pluginStart(this, new LoggerAdapter(Example.Constants.PROJECT_NAME, getLogger()));
    }
}
