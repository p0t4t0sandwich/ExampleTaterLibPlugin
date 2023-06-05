package ca.sperrer.p0t4t0sandwich.template.fabric;

import ca.sperrer.p0t4t0sandwich.template.common.Template;
import ca.sperrer.p0t4t0sandwich.template.fabric.commands.TemplateCommand;
import ca.sperrer.p0t4t0sandwich.template.fabric.listeners.FabricEventListener;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricMain implements DedicatedServerModInitializer {
    public Template template;

    // Logger
    public final Logger logger = LoggerFactory.getLogger("template");

    // Get server type
    public String getServerType() {
        return "Fabric";
    }

    // Singleton instance
    private static FabricMain instance;
    public static FabricMain getInstance() {
        return instance;
    }

    @Override
    public void onInitializeServer() {
        // Singleton instance
        instance = this;

        logger.info("[Template]: Template is running on " + getServerType() + ".");

        // Start Template
        template = new Template("config", logger);
        template.start();

        // Register event listeners
        ServerPlayConnectionEvents.JOIN.register(new FabricEventListener());

        // Register commands
        CommandRegistrationCallback.EVENT.register(TemplateCommand::register);

        // Mod enable message
        logger.info("[Template]: Template has been enabled!");
    }
}
