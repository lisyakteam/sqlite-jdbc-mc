package me.junioraww.sqlite;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ObliviateInvs loaded");
    }

    @Override
    public void onDisable() {
        getLogger().info("ObliviateInvs disabled");
    }
}