package com.exmaple.exampletaterlibplugin.fabric;

import dev.neuralnexus.taterlib.common.event.api.ServerEvents;
import dev.neuralnexus.taterlib.common.logger.GenericLogger;
import com.exmaple.exampletaterlibplugin.common.Constants;
import com.exmaple.exampletaterlibplugin.common.ExampleTaterLibPluginPlugin;
import net.fabricmc.api.DedicatedServerModInitializer;

/**
 * Fabric entry point.
 */
public class FabricPlugin implements DedicatedServerModInitializer, ExampleTaterLibPluginPlugin {
    @Override
    public void onInitializeServer() {
        ServerEvents.STOPPED.register(event -> pluginStop());
        pluginStart(this, new GenericLogger("[" + Constants.PROJECT_NAME + "] ", Constants.PROJECT_ID));
    }
}
