package com.exmaple.pluginname.platforms;

import com.exmaple.pluginname.Example;
import com.exmaple.pluginname.ExamplePlugin;

import dev.neuralnexus.taterlib.logger.LoggerAdapter;

import net.minecraftforge.fml.common.Mod;

/** Forge entry point. */
@Mod(Example.Constants.PROJECT_ID)
public class ForgePlugin implements ExamplePlugin {
    public ForgePlugin() {
        pluginStart(this, new LoggerAdapter(Example.Constants.PROJECT_NAME));
    }
}
