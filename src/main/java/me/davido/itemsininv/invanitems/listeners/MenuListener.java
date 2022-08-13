package me.davido.itemsininv.invanitems.listeners;

import com.sun.org.apache.xpath.internal.objects.XNull;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class MenuListener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){

        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.GREEN + "Guide")) {

            if (e.getCurrentItem() == null) {
                return;
            }

            //See what item they clicked on by getting the material of the item
            if (e.getCurrentItem().getType() == Material.TOTEM_OF_UNDYING) {
                System.out.println("clieck totem");
            } else if (e.getCurrentItem().getType() == Material.BARRIER) {
                System.out.println("clicked barrier");
            } else {
                System.out.println("clicked smth else");
            }

            //make it so that players cannot move items in the inventory
            e.setCancelled(true);

        }

    }

}