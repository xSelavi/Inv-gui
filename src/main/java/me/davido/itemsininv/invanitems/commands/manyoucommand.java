package me.davido.itemsininv.invanitems.commands;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class manyoucommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;


        //9 18 27 36 45 54

        Inventory inventory = Bukkit.createInventory(p, 54, ChatColor.GREEN + "Guide");

        ItemStack itemSword = new ItemStack(Material.NETHERITE_SWORD, 1);
        ItemMeta itemMeta = itemSword.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Weapons");
        itemSword.setItemMeta(itemMeta);

        inventory.setItem(30, itemSword);

        ItemStack itemElytra = new ItemStack(Material.ELYTRA, 1);
        ItemMeta itemElytraMeta = itemElytra.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Magical stuff");
        itemElytra.setItemMeta(itemMeta);

        inventory.setItem(29, itemElytra);

        ItemStack itemIronIngot = new ItemStack(Material.IRON_INGOT, 1);
        ItemMeta  itemIronIngotMeta = itemIronIngot.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Resources");
        itemIronIngot.setItemMeta(itemMeta);

        inventory.setItem(28,  itemIronIngot);

        ItemStack itemBlackStainedGlassPane27 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane27Meta = itemBlackStainedGlassPane27.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane27.setItemMeta(itemMeta);

        inventory.setItem(27, itemBlackStainedGlassPane27);

        ItemStack itemBlackStainedGlassPane26 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane26Meta = itemBlackStainedGlassPane26.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane26.setItemMeta(itemMeta);

        inventory.setItem(26, itemBlackStainedGlassPane26);

        ItemStack itemBlackStainedGlassPane25 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane25Meta = itemBlackStainedGlassPane25.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane25.setItemMeta(itemMeta);

        inventory.setItem(25, itemBlackStainedGlassPane25);

        ItemStack itemBlackStainedGlassPane24 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane24Meta = itemBlackStainedGlassPane24.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane24.setItemMeta(itemMeta);

        inventory.setItem(24, itemBlackStainedGlassPane24);

        ItemStack itemBlackStainedGlassPane23 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane23Meta = itemBlackStainedGlassPane23.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane23.setItemMeta(itemMeta);

        inventory.setItem(23, itemBlackStainedGlassPane23);

        ItemStack itemBlackStainedGlassPane22 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane22Meta = itemBlackStainedGlassPane22.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane22.setItemMeta(itemMeta);

        inventory.setItem(22, itemBlackStainedGlassPane22);

        ItemStack itemBlackStainedGlassPane21 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane21Meta = itemBlackStainedGlassPane21.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane21.setItemMeta(itemMeta);

        inventory.setItem(21, itemBlackStainedGlassPane21);

        ItemStack itemBlackStainedGlassPane20 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane20Meta = itemBlackStainedGlassPane20.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane20.setItemMeta(itemMeta);

        inventory.setItem(20, itemBlackStainedGlassPane20);

        ItemStack itemBlackStainedGlassPane19 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane19Meta = itemBlackStainedGlassPane19.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane19.setItemMeta(itemMeta);

        inventory.setItem(19, itemBlackStainedGlassPane19);

        ItemStack itemBlackStainedGlassPane18 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane18Meta = itemBlackStainedGlassPane18.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane18.setItemMeta(itemMeta);

        inventory.setItem(18, itemBlackStainedGlassPane18);

        ItemStack itemBlackStainedGlassPane17 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane17Meta = itemBlackStainedGlassPane17.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane17.setItemMeta(itemMeta);

        inventory.setItem(17, itemBlackStainedGlassPane17);

        ItemStack enchantedbook16 = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta enchantedbook16Meta = enchantedbook16.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GREEN + "SF Guide");
        enchantedbook16.setItemMeta(itemMeta);

        inventory.setItem(16, enchantedbook16);

        ItemStack itemspyglass15 = new ItemStack(Material.SPYGLASS, 1);
        ItemMeta itemspyglass15Meta = itemspyglass15.getItemMeta();
        itemMeta.setDisplayName(ChatColor.YELLOW + "Search");
        itemspyglass15.setItemMeta(itemMeta);

        inventory.setItem(15, itemspyglass15);

        ItemStack itembarrier14 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1); //come back here skull Twitter
        ItemMeta barrier14Meta = itembarrier14.getItemMeta();
        itemMeta.setDisplayName(" ");
        itembarrier14.setItemMeta(itemMeta);

        inventory.setItem(14, itembarrier14);

        ItemStack itembarrier13 = new ItemStack(Material.COMPASS, 1); //come back here skull Globe
        ItemMeta barrier13Meta = itembarrier13.getItemMeta();
        itemMeta.setDisplayName(ChatColor.RED + "Our Website");
        itembarrier13.setItemMeta(itemMeta);

        inventory.setItem(13, itembarrier13);

        ItemStack itemBlackStainedGlassPane12 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane34Meta = itemBlackStainedGlassPane12.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane12.setItemMeta(itemMeta);

        inventory.setItem(12, itemBlackStainedGlassPane12);

        ItemStack itemnetherstar11 = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta netherstar11Meta = itemnetherstar11.getItemMeta();
        itemMeta.setDisplayName(ChatColor.YELLOW + "Starter Tutorial");
        itemnetherstar11.setItemMeta(itemMeta);

        inventory.setItem(11, itemnetherstar11);

        ItemStack itemtotemdie10 = new ItemStack(Material.TOTEM_OF_UNDYING, 1);
        ItemMeta itemtotemdie10Meta = itemtotemdie10.getItemMeta();
        itemMeta.setDisplayName(ChatColor.YELLOW + "Support");
        itemtotemdie10.setItemMeta(itemMeta);

        inventory.setItem(10, itemtotemdie10);

        ItemStack itemBlackStainedGlassPane9 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane9Meta = itemBlackStainedGlassPane9.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane9.setItemMeta(itemMeta);

        inventory.setItem(9, itemBlackStainedGlassPane9);

        ItemStack itemBlackStainedGlassPane8 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane8Meta = itemBlackStainedGlassPane8.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane8.setItemMeta(itemMeta);

        inventory.setItem(8, itemBlackStainedGlassPane8);

        ItemStack itemBlackStainedGlassPane7 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane7Meta = itemBlackStainedGlassPane7.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane7.setItemMeta(itemMeta);

        inventory.setItem(7, itemBlackStainedGlassPane7);

        ItemStack itemBlackStainedGlassPane6 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane6Meta = itemBlackStainedGlassPane6.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane6.setItemMeta(itemMeta);

        inventory.setItem(6, itemBlackStainedGlassPane6);

        ItemStack itemBlackStainedGlassPane5 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane5Meta = itemBlackStainedGlassPane5.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane5.setItemMeta(itemMeta);

        inventory.setItem(5, itemBlackStainedGlassPane5);

        ItemStack itemBlackStainedGlassPane4 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane4Meta = itemBlackStainedGlassPane4.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane4.setItemMeta(itemMeta);

        inventory.setItem(4, itemBlackStainedGlassPane4);

        ItemStack itemBlackStainedGlassPane3 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane3Meta = itemBlackStainedGlassPane3.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane3.setItemMeta(itemMeta);

        inventory.setItem(3, itemBlackStainedGlassPane3);

        ItemStack itemBlackStainedGlassPane2 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane2Meta = itemBlackStainedGlassPane2.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane2.setItemMeta(itemMeta);

        inventory.setItem(2, itemBlackStainedGlassPane2);

        ItemStack itemBlackStainedGlassPane556 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPaneMeta556 = itemBlackStainedGlassPane556.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane556.setItemMeta(itemMeta);

        inventory.setItem(1, itemBlackStainedGlassPane556);

        ItemStack itemBlackStainedGlassPane0 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane0Meta = itemBlackStainedGlassPane0.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane0.setItemMeta(itemMeta);

        inventory.setItem(0, itemBlackStainedGlassPane0);

        ItemStack itemBlackStainedGlassPane31 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane31Meta = itemBlackStainedGlassPane31.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane31.setItemMeta(itemMeta);

        inventory.setItem(31, itemBlackStainedGlassPane31);

        ItemStack itemcampfire31 = new ItemStack(Material.CAMPFIRE, 1);
        ItemMeta itemcampfire31Meta = itemcampfire31.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Dungeon");
        itemcampfire31.setItemMeta(itemMeta);

        inventory.setItem(32, itemcampfire31);

        ItemStack itemcoockie32 = new ItemStack(Material.COOKIE, 1);
        ItemMeta itemcoockie32Meta = itemcoockie32.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "SF Food");
        itemcoockie32.setItemMeta(itemMeta);

        inventory.setItem(33, itemcoockie32);

        ItemStack itemBlackStainedGlassPane33 = new ItemStack(Material.HOPPER, 1);
        ItemMeta itemBlackStainedGlassPane33Meta = itemBlackStainedGlassPane33.getItemMeta();
        itemMeta.setDisplayName("Cargo");
        itemBlackStainedGlassPane33.setItemMeta(itemMeta);

        inventory.setItem(34, itemBlackStainedGlassPane33);

        ItemStack itemBlackStainedGlassPane341 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane341Meta = itemBlackStainedGlassPane341.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane341.setItemMeta(itemMeta);

        inventory.setItem(35, itemBlackStainedGlassPane341);

        ItemStack itemBlackStainedGlassPane35 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane35Meta = itemBlackStainedGlassPane35.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane35.setItemMeta(itemMeta);

        inventory.setItem(36, itemBlackStainedGlassPane35);

        ItemStack itememerald36 = new ItemStack(Material.EMERALD, 1);
        ItemMeta itememerald36Meta = itememerald36.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Talismans");
        itememerald36.setItemMeta(itemMeta);

        inventory.setItem(37, itememerald36);

        ItemStack itempick37 = new ItemStack(Material.GOLDEN_PICKAXE, 1);
        ItemMeta itempick37Meta = itempick37.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Tools");
        itempick37.setItemMeta(itemMeta);

        inventory.setItem(38, itempick37);

        ItemStack itemshrekgear38 = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
        ItemMeta itemshrekgear38Meta = itemshrekgear38.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Shrekgear");
        itemshrekgear38.setItemMeta(itemMeta);

        inventory.setItem(39, itemshrekgear38);

        ItemStack itemBlackStainedGlassPane39 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane39Meta = itemBlackStainedGlassPane39.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane39.setItemMeta(itemMeta);

        inventory.setItem(40, itemBlackStainedGlassPane39);

        ItemStack itemuseitems40 = new ItemStack(Material.CHEST, 1);
        ItemMeta itemuseitems40Meta = itemuseitems40.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Useful Items");
        itemuseitems40.setItemMeta(itemMeta);

        inventory.setItem(41, itemuseitems40);

        ItemStack itempist41 = new ItemStack(Material.PISTON, 1);
        ItemMeta itempist41Meta = itempist41.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "Machines");
        itempist41.setItemMeta(itemMeta);

        inventory.setItem(42, itempist41);

        ItemStack itemoaksap42 = new ItemStack(Material.OAK_SAPLING, 1);
        ItemMeta itemoaksap42Meta = itemoaksap42.getItemMeta();
        itemMeta.setDisplayName(ChatColor.BLUE + "SF Gardens");
        itemoaksap42.setItemMeta(itemMeta);

        inventory.setItem(43, itemoaksap42);

        ItemStack itemBlackStainedGlassPane43 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane43Meta = itemBlackStainedGlassPane43.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane43.setItemMeta(itemMeta);

        inventory.setItem(44, itemBlackStainedGlassPane43);

        ItemStack itemBlackStainedGlassPane44 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane44Meta = itemBlackStainedGlassPane44.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane44.setItemMeta(itemMeta);

        inventory.setItem(45, itemBlackStainedGlassPane44);

        ItemStack itemBlackStainedGlassPane45 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane45Meta = itemBlackStainedGlassPane45.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane45.setItemMeta(itemMeta);

        inventory.setItem(46, itemBlackStainedGlassPane45);

        ItemStack itemBlackStainedGlassPane46 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane46Meta = itemBlackStainedGlassPane46.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane46.setItemMeta(itemMeta);

        inventory.setItem(47, itemBlackStainedGlassPane46);

        ItemStack itemBlackStainedGlassPane47 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane47Meta = itemBlackStainedGlassPane47.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane47.setItemMeta(itemMeta);

        inventory.setItem(48, itemBlackStainedGlassPane47);

        ItemStack itemBlackStainedGlassPane48 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane48Meta = itemBlackStainedGlassPane48.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane48.setItemMeta(itemMeta);

        inventory.setItem(49, itemBlackStainedGlassPane48);

        ItemStack itemBlackStainedGlassPane49 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane49Meta = itemBlackStainedGlassPane49.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane49.setItemMeta(itemMeta);

        inventory.setItem(50, itemBlackStainedGlassPane49);

        ItemStack itemBlackStainedGlassPane50 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane50Meta = itemBlackStainedGlassPane50.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane50.setItemMeta(itemMeta);

        inventory.setItem(51, itemBlackStainedGlassPane50);

        ItemStack itemBlackStainedGlassPane51 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane51Meta = itemBlackStainedGlassPane51.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane51.setItemMeta(itemMeta);

        inventory.setItem(52, itemBlackStainedGlassPane51);

        ItemStack itemBlackStainedGlassPane52 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta itemBlackStainedGlassPane52Meta = itemBlackStainedGlassPane52.getItemMeta();
        itemMeta.setDisplayName(" ");
        itemBlackStainedGlassPane52.setItemMeta(itemMeta);

        inventory.setItem(53, itemBlackStainedGlassPane52);

       // ItemStack itemBlackStainedGlassPane53 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
       // ItemMeta itemBlackStainedGlassPane53Meta = itemBlackStainedGlassPane53.getItemMeta();
        //itemBlackStainedGlassPane53.setItemMeta(itemMeta);

        //inventory.setItem(54, itemBlackStainedGlassPane53);

        p.openInventory(inventory);

        return false;
    }
}
