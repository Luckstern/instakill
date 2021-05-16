package io.github.luckstern.instakill;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("Instakill has officially been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Instakill has officially been disabled!");
    }

    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent event) {
        if (event.getDamager().getType().equals(EntityType.PLAYER)) {
            Bukkit.broadcastMessage("Entity has been hit by player!");
        }
    }
}
