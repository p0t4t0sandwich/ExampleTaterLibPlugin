package com.example.pluginname.platforms;

import com.example.pluginname.Example;
import com.example.pluginname.ExamplePlugin;

import dev.neuralnexus.taterlib.logger.LoggerAdapter;

import net.minecraftforge.fml.common.Mod;

/** Forge entry point. */
@Mod(
        value = Example.Constants.PROJECT_ID,
        modid = Example.Constants.PROJECT_ID,
        useMetadata = true,
        serverSideOnly = true,
        acceptableRemoteVersions = "*")
public class ForgePlugin implements ExamplePlugin {
    public ForgePlugin() {
        pluginStart(this, new LoggerAdapter(Example.Constants.PROJECT_NAME));
    }
}
