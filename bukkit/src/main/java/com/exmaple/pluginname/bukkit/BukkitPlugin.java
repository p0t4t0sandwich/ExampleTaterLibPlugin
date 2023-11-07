package com.exmaple.pluginname.bukkit;

import dev.neuralnexus.taterlib.bukkit.logger.BukkitLogger;
import com.exmaple.pluginname.common.ExamplePlugin;
import dev.neuralnexus.taterlib.common.event.api.ServerEvents;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Bukkit entry point.
 */
public class BukkitPlugin extends JavaPlugin implements ExamplePlugin {
    public BukkitPlugin() {
        ServerEvents.STOPPED.register(event -> pluginStop());
        pluginStart(this, new BukkitLogger(getLogger()));
    }
}
