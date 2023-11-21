package com.exmaple.pluginname.forge;

import com.exmaple.pluginname.common.Example;
import com.exmaple.pluginname.common.ExamplePlugin;

import dev.neuralnexus.taterlib.common.logger.GenericLogger;

import net.minecraftforge.fml.common.Mod;

/** Forge entry point. */
@Mod(Example.Constants.PROJECT_ID)
public class ForgePlugin implements ExamplePlugin {
    public ForgePlugin() {
        pluginStart(
                this,
                new GenericLogger(
                        "[" + Example.Constants.PROJECT_NAME + "] ", Example.Constants.PROJECT_ID));
    }
}
