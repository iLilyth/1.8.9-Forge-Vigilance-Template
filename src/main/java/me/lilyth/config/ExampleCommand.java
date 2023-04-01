package me.lilyth.config;

import gg.essential.api.EssentialAPI;
import gg.essential.api.commands.Command;
import gg.essential.api.commands.DefaultHandler;
import me.lilyth.ExampleMod;

public class ExampleCommand extends Command {
    private final ExampleConfiguration exampleConfiguration = ExampleMod.getConfig();
    public ExampleCommand(String name) {
        super(name);
    }
    @DefaultHandler
    public void handle() {
        EssentialAPI.getGuiUtil().openScreen(exampleConfiguration.gui());
    }
}