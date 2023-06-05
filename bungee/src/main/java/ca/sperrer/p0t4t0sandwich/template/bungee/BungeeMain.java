package ca.sperrer.p0t4t0sandwich.template.bungee;

import ca.sperrer.p0t4t0sandwich.template.bungee.commands.TemplateCommand;
import ca.sperrer.p0t4t0sandwich.template.bungee.listeners.BungeeEventListener;
import ca.sperrer.p0t4t0sandwich.template.common.Template;
import net.md_5.bungee.api.plugin.Plugin;

public class BungeeMain extends Plugin {
    public Template template;

    // Get server type
    public String getServerType() {
        return "BungeeCord";
    }

    // Singleton instance
    private static BungeeMain instance;
    public static BungeeMain getInstance() {
        return instance;
    }
    @Override
    public void onEnable() {
        // Singleton instance
        instance = this;

        getLogger().info("Template is running on " + getServerType() + ".");

        // Start
        template = new Template("plugins", getLogger());
        template.start();

        // Register event listener
        getProxy().getPluginManager().registerListener(this, new BungeeEventListener());

        // Register commands
        getProxy().getPluginManager().registerCommand(this, new TemplateCommand());

        // Plugin enable message
        getLogger().info("Template has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin disable message
        getLogger().info("Template has been disabled!");
    }
}
