package com.exmaple.pluginname.fabric;

import com.exmaple.pluginname.common.Example;
import com.exmaple.pluginname.common.ExamplePlugin;

import dev.neuralnexus.taterlib.common.logger.GenericLogger;

import net.fabricmc.api.DedicatedServerModInitializer;

/** Fabric entry point. */
public class FabricPlugin implements DedicatedServerModInitializer, ExamplePlugin {
    public FabricPlugin() {
        pluginStart(
                this,
                new GenericLogger(
                        "[" + Example.Constants.PROJECT_NAME + "] ", Example.Constants.PROJECT_ID));
    }

    @Override
    public void onInitializeServer() {}
}
