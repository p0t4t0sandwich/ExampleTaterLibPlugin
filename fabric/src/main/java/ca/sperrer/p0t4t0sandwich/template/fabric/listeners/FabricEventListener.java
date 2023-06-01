package ca.sperrer.p0t4t0sandwich.template.fabric.listeners;

import ca.sperrer.p0t4t0sandwich.template.fabric.FabricMain;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;

import static ca.sperrer.p0t4t0sandwich.template.common.Utils.runTaskAsync;

public class FabricEventListener implements ServerPlayConnectionEvents.Join {
    FabricMain mod = FabricMain.getInstance();

    @Override
    public void onPlayReady(ServerPlayNetworkHandler handler, PacketSender sender, MinecraftServer server) {
        runTaskAsync(() -> {
            try {
//                mod.LPPronouns.pronounsData.refreshPronouns(mapPlayer(handler.getPlayer()));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }
}
