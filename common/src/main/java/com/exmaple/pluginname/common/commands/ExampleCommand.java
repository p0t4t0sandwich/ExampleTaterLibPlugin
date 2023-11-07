package com.exmaple.pluginname.common.commands;

import dev.neuralnexus.taterlib.common.command.Command;
import dev.neuralnexus.taterlib.common.command.Sender;

/**
 * Home Command.
 */
public class ExampleCommand implements Command {
    private String name = "home";

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
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
    public String execute(String[] args) {
        return null;
    }

    @Override
    public boolean execute(Sender sender, String label, String[] args) {
        return true;
    }
}
