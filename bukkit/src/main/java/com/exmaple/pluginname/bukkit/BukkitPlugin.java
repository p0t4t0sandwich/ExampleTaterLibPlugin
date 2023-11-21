package com.exmaple.pluginname.bukkit;

import com.exmaple.pluginname.common.ExamplePlugin;

import dev.neuralnexus.taterlib.bukkit.logger.BukkitLogger;

import org.bukkit.plugin.java.JavaPlugin;

/** Bukkit entry point. */
public class BukkitPlugin extends JavaPlugin implements ExamplePlugin {
    public BukkitPlugin() {
        pluginStart(this, new BukkitLogger(getLogger()));
    }
}
