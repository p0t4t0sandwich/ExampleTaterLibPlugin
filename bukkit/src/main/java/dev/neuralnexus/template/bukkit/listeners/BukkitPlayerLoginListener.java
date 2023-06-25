package dev.neuralnexus.template.bukkit.listeners;

import dev.neuralnexus.template.common.listneners.TemplatePlayerLoginListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class BukkitPlayerLoginListener implements Listener, TemplatePlayerLoginListener {
    @EventHandler
    public void onPlayerLogin(PlayerJoinEvent event) {
        // Do stuff
    }
}
