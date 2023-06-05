package ca.sperrer.p0t4t0sandwich.template.bungee.listeners;

import ca.sperrer.p0t4t0sandwich.template.bungee.BungeeMain;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

import static ca.sperrer.p0t4t0sandwich.template.common.Utils.runTaskAsync;

public class BungeeEventListener implements Listener {
    BungeeMain plugin = BungeeMain.getInstance();

    @EventHandler
    public void onPostLogin(PostLoginEvent event) {
        runTaskAsync(() -> {
            try {
                // Do stuff
            } catch (Exception e) {
                System.err.println(e);
                e.printStackTrace();
            }
        });
    }
}
