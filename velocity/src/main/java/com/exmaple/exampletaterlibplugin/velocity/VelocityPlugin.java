package com.exmaple.exampletaterlibplugin.velocity;

import com.velocitypowered.api.plugin.Dependency;
import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import dev.neuralnexus.taterlib.common.event.api.ServerEvents;
import dev.neuralnexus.taterlib.velocity.logger.VelocityLogger;
import com.exmaple.exampletaterlibplugin.common.Constants;
import com.exmaple.exampletaterlibplugin.common.ExampleTaterLibPluginPlugin;
import org.slf4j.Logger;

/**
 * Velocity entry point.
 */
@Plugin(
        id = Constants.PROJECT_ID,
        name = Constants.PROJECT_NAME,
        version = Constants.PROJECT_VERSION,
        authors = Constants.PROJECT_AUTHORS,
        description = Constants.PROJECT_DESCRIPTION,
        url = Constants.PROJECT_URL,
        dependencies = {
                @Dependency(id = "luckperms", optional = true)
        }
)
public class VelocityPlugin implements ExampleTaterLibPluginPlugin {
    @Inject private ProxyServer server;
    @Inject private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        ServerEvents.STOPPED.register(e -> pluginStop());
        pluginStart(this, new VelocityLogger(logger));
    }
}
