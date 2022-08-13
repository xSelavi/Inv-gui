package me.davido.itemsininv.invanitems.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class ClickerListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e){
        if(e.getWhoClicked() instanceof Player){
            Player p = (Player) e.getWhoClicked();
            ItemStack i = e.getCurrentItem();
            if(i.getType().equals(Material.COMPASS)){
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.BLUE + "Come check out our website to learn all you need!!!, https://www.ageofelysian.com/");
            }else
                if(i.getType().equals(Material.CAMPFIRE))
            {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "Come check out our website to learn all you need!!!, https://www.ageofelysian.com/#/dungeons");
            }
        }
    }
  }