package com.exmaple.exampletaterlibplugin.forge;

import dev.neuralnexus.taterlib.common.event.api.ServerEvents;
import dev.neuralnexus.taterlib.common.logger.GenericLogger;
import com.exmaple.exampletaterlibplugin.common.Constants;
import com.exmaple.exampletaterlibplugin.common.ExampleTaterLibPluginPlugin;
import net.minecraftforge.fml.common.Mod;

/**
 * Forge entry point.
 */
@Mod(Constants.PROJECT_ID)
public class ForgePlugin implements ExampleTaterLibPluginPlugin {
    public ForgePlugin() {
        ServerEvents.STOPPED.register(event -> pluginStop());
        pluginStart(this, new GenericLogger("[" + Constants.PROJECT_NAME + "] ", Constants.PROJECT_ID));
    }
}
