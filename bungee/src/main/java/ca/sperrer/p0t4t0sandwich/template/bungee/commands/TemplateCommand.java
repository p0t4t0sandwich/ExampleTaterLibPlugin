package ca.sperrer.p0t4t0sandwich.template.bungee.commands;

import ca.sperrer.p0t4t0sandwich.template.bungee.BungeeMain;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

import static ca.sperrer.p0t4t0sandwich.template.common.Utils.runTaskAsync;

public class TemplateCommand extends Command {
    private final BungeeMain plugin = BungeeMain.getInstance();

    public TemplateCommand() {
        super("template");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        runTaskAsync(() -> {
            try {
                // Check if sender is a player
                if ((sender instanceof ProxiedPlayer)) {
                    ProxiedPlayer player = (ProxiedPlayer) sender;

                    String text = "";

                    player.sendMessage(new ComponentBuilder(text).color(ChatColor.GREEN).create());
                }
            } catch (Exception e) {
                System.err.println(e);
                e.printStackTrace();
            }
        });
    }
}
