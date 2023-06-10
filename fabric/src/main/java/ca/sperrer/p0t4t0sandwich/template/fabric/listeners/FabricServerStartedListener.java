package ca.sperrer.p0t4t0sandwich.template.fabric.listeners;

import ca.sperrer.p0t4t0sandwich.template.common.Template;
import ca.sperrer.p0t4t0sandwich.template.fabric.FabricMain;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.server.MinecraftServer;

public class FabricServerStartedListener implements ServerLifecycleEvents.ServerStarted {
    FabricMain mod = FabricMain.getInstance();

    @Override
    public void onServerStarted(MinecraftServer server) {
        try {
            // Start LPPronouns
            mod.template = new Template("config", mod.logger);
            mod.template.start();
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }
}
