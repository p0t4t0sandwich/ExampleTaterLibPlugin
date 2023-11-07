package com.exmaple.pluginname.forge;

import com.exmaple.pluginname.common.Example;
import dev.neuralnexus.taterlib.common.event.api.ServerEvents;
import dev.neuralnexus.taterlib.common.logger.GenericLogger;
import com.exmaple.pluginname.common.ExamplePlugin;
import net.minecraftforge.fml.common.Mod;

/**
 * Forge entry point.
 */
@Mod(Example.Constants.PROJECT_ID)
public class ForgePlugin implements ExamplePlugin {
    public ForgePlugin() {
        ServerEvents.STOPPED.register(event -> pluginStop());
        pluginStart(this, new GenericLogger("[" + Example.Constants.PROJECT_NAME + "] ", Example.Constants.PROJECT_ID));
    }
}
