package com.exmaple.pluginname.neoforge;

import com.exmaple.pluginname.common.Example;
import com.exmaple.pluginname.common.ExamplePlugin;
import com.mojang.logging.LogUtils;

import dev.neuralnexus.taterlib.neoforge.logger.NeoForgeLogger;

import net.neoforged.fml.common.Mod;

/** NeoForge entry point. */
@Mod(Example.Constants.PROJECT_ID)
public class NeoForgePlugin implements ExamplePlugin {
    public NeoForgePlugin() {
        pluginStart(this, new NeoForgeLogger(LogUtils.getLogger()));
    }
}
