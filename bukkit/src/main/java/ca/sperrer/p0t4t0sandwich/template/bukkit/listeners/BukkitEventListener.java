package ca.sperrer.p0t4t0sandwich.template.bukkit.listeners;

import ca.sperrer.p0t4t0sandwich.template.bukkit.BukkitMain;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static ca.sperrer.p0t4t0sandwich.template.common.Utils.runTaskAsync;

public class BukkitEventListener implements Listener {
    BukkitMain plugin = BukkitMain.getInstance();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        runTaskAsync(() -> {
            try {
                //
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }
}
