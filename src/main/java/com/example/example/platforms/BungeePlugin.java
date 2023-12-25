package com.example.example.platforms;

import com.example.example.Example;
import com.example.example.ExamplePlugin;

import dev.neuralnexus.taterlib.logger.LoggerAdapter;

import net.md_5.bungee.api.plugin.Plugin;

/** Bungee entry point. */
public class BungeePlugin extends Plugin implements ExamplePlugin {
    public BungeePlugin() {
        pluginStart(this, new LoggerAdapter(Example.Constants.PROJECT_NAME, getLogger()));
    }
}
