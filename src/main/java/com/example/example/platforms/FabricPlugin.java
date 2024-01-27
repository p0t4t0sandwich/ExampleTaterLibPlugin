package com.example.example.platforms;

import com.example.example.Example;
import com.example.example.ExamplePlugin;

import dev.neuralnexus.taterlib.logger.LoggerAdapter;

import net.fabricmc.api.ModInitializer;

/** Fabric entry point. */
public class FabricPlugin implements ModInitializer, ExamplePlugin {
    public FabricPlugin() {
        pluginStart(this, new LoggerAdapter(Example.Constants.PROJECT_NAME));
    }

    @Override
    public void onInitialize() {}
}
