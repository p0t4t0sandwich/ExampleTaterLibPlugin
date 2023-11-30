package com.exmaple.pluginname.platforms;

import com.exmaple.pluginname.Example;
import com.exmaple.pluginname.ExamplePlugin;

import dev.neuralnexus.taterlib.logger.LoggerAdapter;

import org.bukkit.plugin.java.JavaPlugin;

/** Bukkit entry point. */
public class BukkitPlugin extends JavaPlugin implements ExamplePlugin {
    public BukkitPlugin() {
        pluginStart(this, new LoggerAdapter(Example.Constants.PROJECT_NAME, getLogger()));
    }
}
