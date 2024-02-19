package com.example.example.platforms;

import com.example.example.Example;
import com.example.example.ExamplePlugin;

import dev.neuralnexus.taterlib.logger.LoggerAdapter;

import org.bukkit.plugin.java.JavaPlugin;

/** Bukkit entry point. */
public class BukkitPlugin extends JavaPlugin implements ExamplePlugin {
    public BukkitPlugin() {
        pluginStart(
                this,
                getServer(),
                getLogger(),
                new LoggerAdapter(Example.Constants.PROJECT_NAME, getLogger()));
    }
}
