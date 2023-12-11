package com.example.pluginname.platforms;

import com.example.pluginname.Example;
import com.example.pluginname.ExamplePlugin;

import dev.neuralnexus.taterlib.logger.LoggerAdapter;

import net.fabricmc.api.DedicatedServerModInitializer;

/** Fabric entry point. */
public class FabricPlugin implements DedicatedServerModInitializer, ExamplePlugin {
    public FabricPlugin() {
        pluginStart(this, new LoggerAdapter(Example.Constants.PROJECT_NAME));
    }

    @Override
    public void onInitializeServer() {}
}
