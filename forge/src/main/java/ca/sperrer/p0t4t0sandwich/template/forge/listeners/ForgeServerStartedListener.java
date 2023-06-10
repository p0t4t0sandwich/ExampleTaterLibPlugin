package ca.sperrer.p0t4t0sandwich.template.forge.listeners;

import ca.sperrer.p0t4t0sandwich.template.common.Template;
import ca.sperrer.p0t4t0sandwich.template.forge.ForgeMain;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeServerStartedListener {
    ForgeMain mod = ForgeMain.getInstance();

    @SubscribeEvent
    public void onServerStart(ServerStartingEvent event) {
        try {
            // Start Template
            mod.template = new Template("config", mod.logger);
            mod.template.start();
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }
}
