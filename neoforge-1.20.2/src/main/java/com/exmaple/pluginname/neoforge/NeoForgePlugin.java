package com.exmaple.pluginname.neoforge;

import com.exmaple.pluginname.common.Example;
import com.mojang.logging.LogUtils;
import dev.neuralnexus.taterlib.common.event.api.ServerEvents;
import dev.neuralnexus.taterlib.neoforge.logger.NeoForgeLogger;
import com.exmaple.pluginname.common.ExamplePlugin;
import net.neoforged.fml.common.Mod;

/**
 * NeoForge entry point.
 */
@Mod(Example.Constants.PROJECT_ID)
public class NeoForgePlugin implements ExamplePlugin {
    public NeoForgePlugin() {
        ServerEvents.STOPPED.register(event -> pluginStop());
        pluginStart(this, new NeoForgeLogger(LogUtils.getLogger()));
    }
}
