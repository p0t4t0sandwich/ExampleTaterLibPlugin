package com.exmaple.pluginname.common.commands;

import com.exmaple.pluginname.common.api.ExampleAPIProvider;

import dev.neuralnexus.taterlib.common.Utils;
import dev.neuralnexus.taterlib.common.command.Command;
import dev.neuralnexus.taterlib.common.command.Sender;
import dev.neuralnexus.taterlib.common.player.Player;

/** Example Command. */
public class ExampleCommand implements Command {
    private String name = "example";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return "Example command";
    }

    @Override
    public String getUsage() {
        return "/example";
    }

    @Override
    public String getPermission() {
        return "example.command.example";
    }

    @Override
    public boolean execute(Sender sender, String label, String[] args) {
        if (!sender.hasPermission(getPermission())) {
            sender.sendMessage(
                    Utils.substituteSectionSign(
                            "&cYou do not have permission to execute this command!"));
            return true;
        }
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(
                    Utils.substituteSectionSign(
                            "&cThis command can only be executed by the console!"));
            return true;
        }
        if (args.length != 0) {
            sender.sendMessage(Utils.substituteSectionSign("&cUsage: " + getUsage()));
            return true;
        }

        sender.sendMessage(Utils.substituteSectionSign(ExampleAPIProvider.get().getSomeData()));
        return true;
    }
}
