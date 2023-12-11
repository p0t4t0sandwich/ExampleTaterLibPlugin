package com.example.pluginname.platforms;

import com.example.pluginname.Example;
import com.example.pluginname.ExamplePlugin;
import com.mojang.logging.LogUtils;

import dev.neuralnexus.taterlib.logger.LoggerAdapter;

import net.neoforged.fml.common.Mod;

/** NeoForge entry point. */
@Mod(Example.Constants.PROJECT_ID)
public class NeoForgePlugin implements ExamplePlugin {
    public NeoForgePlugin() {
        pluginStart(this, new LoggerAdapter(Example.Constants.PROJECT_NAME, LogUtils.getLogger()));
    }
}
