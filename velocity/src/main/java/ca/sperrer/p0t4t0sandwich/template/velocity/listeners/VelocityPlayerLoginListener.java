package ca.sperrer.p0t4t0sandwich.template.velocity.listeners;

import ca.sperrer.p0t4t0sandwich.template.velocity.VelocityMain;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.connection.LoginEvent;

import static ca.sperrer.p0t4t0sandwich.template.common.Utils.runTaskAsync;

public class VelocityPlayerLoginListener {
    VelocityMain plugin = VelocityMain.getInstance();

    @Subscribe
    public void onPlayerLogin(LoginEvent event) {
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
