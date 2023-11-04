package com.exmaple.exampletaterlibplugin.neoforge;

import com.mojang.logging.LogUtils;
import dev.neuralnexus.taterlib.common.event.api.ServerEvents;
import dev.neuralnexus.taterlib.neoforge.logger.NeoForgeLogger;
import com.exmaple.exampletaterlibplugin.common.Constants;
import com.exmaple.exampletaterlibplugin.common.ExampleTaterLibPluginPlugin;
import net.neoforged.fml.common.Mod;

/**
 * NeoForge entry point.
 */
@Mod(Constants.PROJECT_ID)
public class NeoForgePlugin implements ExampleTaterLibPluginPlugin {
    public NeoForgePlugin() {
        ServerEvents.STOPPED.register(event -> pluginStop());
        pluginStart(this, new NeoForgeLogger(LogUtils.getLogger()));
    }
}
