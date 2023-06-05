package ca.sperrer.p0t4t0sandwich.template.bukkit;

import ca.sperrer.p0t4t0sandwich.template.bukkit.commands.TemplateCommand;
import ca.sperrer.p0t4t0sandwich.template.bukkit.listeners.BukkitEventListener;
import ca.sperrer.p0t4t0sandwich.template.common.Template;
import org.bukkit.plugin.java.JavaPlugin;

import static ca.sperrer.p0t4t0sandwich.template.common.Utils.*;

public class BukkitMain extends JavaPlugin {
    public Template template;

    // Singleton instance
    private static BukkitMain instance;
    public static BukkitMain getInstance() {
        return instance;
    }

    public String getServerType() {
        if (isMagma()) {
            return "Magma";
        } else if (isMohist()) {
            return "Mohist";
        } else if (isArclight()) {
            return "Arclight";
        } else if (isFolia()) {
            return "Folia";
        } else if (isPaper()) {
            return "Paper";
        } else if (isSpigot()) {
            return "Spigot";
        } else if (isCraftBukkit()) {
            return "CraftBukkit";
        } else {
            return "Unknown";
        }
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
        getServer().getPluginManager().registerEvents(new BukkitEventListener(), this);

        // Register commands
        getCommand("template").setExecutor(new TemplateCommand());

        // Plugin enable message
        getLogger().info("Template has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin disable message
        getLogger().info("Template has been disabled!");
    }
}
