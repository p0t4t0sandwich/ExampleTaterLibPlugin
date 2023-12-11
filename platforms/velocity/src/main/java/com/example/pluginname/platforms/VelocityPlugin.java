package com.example.pluginname.platforms;

import com.example.pluginname.Example;
import com.example.pluginname.ExamplePlugin;
import com.google.inject.Inject;
import com.velocitypowered.api.plugin.Dependency;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;

import dev.neuralnexus.taterlib.logger.LoggerAdapter;

import org.slf4j.Logger;

/** Velocity entry point. */
@Plugin(
        id = Example.Constants.PROJECT_ID,
        name = Example.Constants.PROJECT_NAME,
        version = Example.Constants.PROJECT_VERSION,
        authors = Example.Constants.PROJECT_AUTHORS,
        description = Example.Constants.PROJECT_DESCRIPTION,
        url = Example.Constants.PROJECT_URL,
        dependencies = {
            @Dependency(id = "taterlib"),
            @Dependency(id = "luckperms", optional = true)
        })
public class VelocityPlugin implements ExamplePlugin {
    @Inject
    public VelocityPlugin(ProxyServer server, Logger logger) {
        pluginStart(server, new LoggerAdapter(Example.Constants.PROJECT_NAME, logger));
    }
}
