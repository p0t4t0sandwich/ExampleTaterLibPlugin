package com.exmaple.pluginname.fabric;

import com.exmaple.pluginname.common.Example;
import dev.neuralnexus.taterlib.common.event.api.ServerEvents;
import dev.neuralnexus.taterlib.common.logger.GenericLogger;
import com.exmaple.pluginname.common.ExamplePlugin;
import net.fabricmc.api.DedicatedServerModInitializer;

/**
 * Fabric entry point.
 */
public class FabricPlugin implements DedicatedServerModInitializer, ExamplePlugin {
    public FabricPlugin() {
        ServerEvents.STOPPED.register(event -> pluginStop());
        pluginStart(this, new GenericLogger("[" + Example.Constants.PROJECT_NAME + "] ", Example.Constants.PROJECT_ID));
    }

    @Override
    public void onInitializeServer() {}
}
