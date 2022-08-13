package me.davido.itemsininv.invanitems;

import me.davido.itemsininv.invanitems.commands.manyoucommand;
import me.davido.itemsininv.invanitems.listeners.ClickerListener;
import me.davido.itemsininv.invanitems.listeners.MenuListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;

public final class Invanitems extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("menu").setExecutor(new manyoucommand());

        getServer().getPluginManager().registerEvents(new MenuListener(), this);

        getServer().getPluginManager().registerEvents(new ClickerListener(), this);
    }

}
