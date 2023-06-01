package ca.sperrer.p0t4t0sandwich.template.forge.listeners;

import ca.sperrer.p0t4t0sandwich.template.forge.ForgeMain;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static ca.sperrer.p0t4t0sandwich.template.common.Utils.runTaskAsync;

public class ForgeEventListener {
    ForgeMain mod = ForgeMain.getInstance();

    @SubscribeEvent
    public void onPlayerConnect(PlayerEvent.PlayerLoggedInEvent event) {
        runTaskAsync(() -> {
            try {
//                mod.LPPronouns.pronounsData.refreshPronouns(mapPlayer((ServerPlayer) event.getEntity()));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }
}
