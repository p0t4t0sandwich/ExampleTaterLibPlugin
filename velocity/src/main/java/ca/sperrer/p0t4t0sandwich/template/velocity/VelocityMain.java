package ca.sperrer.p0t4t0sandwich.template.velocity;

import ca.sperrer.p0t4t0sandwich.template.common.Template;
import ca.sperrer.p0t4t0sandwich.template.velocity.commands.VelocityTemplateCommand;
import ca.sperrer.p0t4t0sandwich.template.velocity.listeners.VelocityPlayerLoginListener;
import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

@Plugin(
        id = "template",
        name = "Template",
        version = "1.0.0",
        authors = "p0t4t0sandwich",
        description = "Template",
        url = "https://github.com/p0t4t0sandwich/Template",
        dependencies = {}
)
public class VelocityMain {
    public Template template;

    @Inject
    private ProxyServer server;

    @Inject
    private Logger logger;

    // Get logger
    public Logger getLogger() {
        return this.logger;
    }

    // Get server type
    public String getServerType() {
        return "Velocity";
    }

    // Singleton instance
    private static VelocityMain instance;
    public static VelocityMain getInstance() {
        return instance;
    }

    public ProxyServer getServer() {
        return this.server;
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        // Singleton instance
        instance = this;

        this.logger.info("Template is running on " + getServerType() + ".");

        // Start LPPronouns
        template = new Template("plugins", getLogger());
        template.start();

        // Register event listener
        server.getEventManager().register(this, new VelocityPlayerLoginListener());

        // Register commands
        server.getCommandManager().register("template", new VelocityTemplateCommand());

        // Plugin enable message
        this.logger.info("Template has been enabled!");
    }
}
