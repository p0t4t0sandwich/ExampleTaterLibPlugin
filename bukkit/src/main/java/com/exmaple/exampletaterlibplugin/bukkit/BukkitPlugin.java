package com.exmaple.exampletaterlibplugin.bukkit;

import dev.neuralnexus.taterlib.bukkit.logger.BukkitLogger;
import com.exmaple.exampletaterlibplugin.common.ExampleTaterLibPluginPlugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Bukkit entry point.
 */
public class BukkitPlugin extends JavaPlugin implements ExampleTaterLibPluginPlugin {
    @Override
    public void onEnable() {
        pluginStart(this, new BukkitLogger(getLogger()));
    }

    @Override
    public void onDisable() {
        pluginStop();
    }
}
