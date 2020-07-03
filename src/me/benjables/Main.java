package me.benjables;

import ch.njol.skript.Skript;
import ch.njol.skript.SkriptAddon;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.logging.Logger;

public class Main extends JavaPlugin {

    SkriptAddon addon;
    private Logger logger = Bukkit.getLogger();

    public void onEnable() {
        addon = Skript.registerAddon(this);
        if (Bukkit.getPluginManager().getPlugin("Skript") != null) {
            try {
                addon.loadClasses("me.benjables.addon", "elements");
            } catch (IOException e) {
                e.printStackTrace();
                logger.info("Elements could not be loaded!");
            }
        }
        logger.info("Diskuises enabled!");
    }

}
