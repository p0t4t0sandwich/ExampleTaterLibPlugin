package com.exmaple.exampletaterlibplugin.bungee;

import dev.neuralnexus.taterlib.bungee.logger.BungeeLogger;
import com.exmaple.exampletaterlibplugin.common.ExampleTaterLibPluginPlugin;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * Bungee entry point.
 */
public class BungeePlugin extends Plugin implements ExampleTaterLibPluginPlugin {
    @Override
    public void onEnable() {
        pluginStart(this, new BungeeLogger(getLogger()));
    }

    @Override
    public void onDisable() {
        pluginStop();
    }
}
