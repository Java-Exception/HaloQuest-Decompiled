package software.tims.haloquests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import me.clip.ezblocks.EZBlocks;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUI implements Listener {

    public Inventory createGui(String title, int size) {
        return Bukkit.getServer().createInventory(null, size, title);
    }

    public List<Integer> milestonesList = Arrays.asList(1000,2000,3000,4000,5000,10000,20000,30000,40000,50000,100000,200000,300000,400000,500000,1000000,2000000,
            3000000,4000000,5000000,10000000,20000000,30000000,40000000,50000000,100000000,110000000,120000000,130000000,140000000,150000000, 200000000,250000000,
            260000000, 270000000,280000000,290000000,300000000,350000000,400000000,500000000);

    public void openInventoryMain(final HumanEntity ent) {
        Inventory inv = this.createGui("Quests", 27);
        inv.setItem(12, createGuiItem(Material.DIAMOND_PICKAXE, "§b§lBlocks Mined", "§cThis quest gives rewards", "§cfor mining blocks"));
        inv.setItem(14, createGuiItem(Material.IRON_FENCE, "§c§lPrestiges", "§bThis quest gives rewards", "§bfor mining blocks"));
        inv.setItem(26, createGuiItem(Material.BARRIER, "§c§l§oBack", "§c§o Exit the GUI"));

        //ent.sendMessage("Right Before openInv");
        ent.openInventory(inv);
    }

    public void openInventoryBlocks1(final HumanEntity ent) {
        int size = 36;

        Inventory inv = this.createGui("Blocks Mined 1/2", size);
//        inv.setItem(size - 9, createGuiItem(Material.ARROW, "§oBack"));
        inv.setItem(size - 1, createGuiItem(Material.ARROW, "§oNext"));
        inv.setItem(31, createGuiItem(Material.BARRIER, "§oBack", "§c§oGo back to the", "§c§oquest selector"));

        for(int i = 0; i <= milestonesList.size(); i++){
            if(EZBlocks.getEZBlocks().getBlocksBroken((Player) ent) == milestonesList.get(i)){
                inv.setItem(i+1, createGuiItem(Material.EMERALD_BLOCK, "§b§l" + milestonesList.get(i), "§a§lUNLOCKED"));
            }else{
                inv.setItem(i+1, createGuiItem(Material.REDSTONE_BLOCK, "§b§l1000", "§cMine "+ milestonesList.get(i) + "blocks for this reward"));
            }
        }
        /*inv.setItem(1, createGuiItem(Material.EMERALD_BLOCK, "§b§l2000", "§cMine 2000 blocks for this reward"));
        inv.setItem(2, createGuiItem(Material.EMERALD_BLOCK, "§b§l3000", "§cMine 3000 blocks for this reward"));
        inv.setItem(3, createGuiItem(Material.EMERALD_BLOCK, "§b§l4000", "§cMine 4000 blocks for this reward"));
        inv.setItem(4, createGuiItem(Material.EMERALD_BLOCK, "§b§l5000", "§cMine 5000 blocks for this reward"));
        inv.setItem(5, createGuiItem(Material.EMERALD_BLOCK, "§b§l10000", "§cMine 10000 blocks for this reward"));
        inv.setItem(6, createGuiItem(Material.EMERALD_BLOCK, "§b§l20000", "§cMine 20000 blocks for this reward"));
        inv.setItem(7, createGuiItem(Material.EMERALD_BLOCK, "§b§l30000", "§cMine 30000 blocks for this reward"));
        inv.setItem(8, createGuiItem(Material.EMERALD_BLOCK, "§b§l40000", "§cMine 40000 blocks for this reward"));
        inv.setItem(9, createGuiItem(Material.EMERALD_BLOCK, "§b§l50000", "§cMine 50000 blocks for this reward"));
        inv.setItem(10, createGuiItem(Material.EMERALD_BLOCK, "§b§l100000", "§cMine 100000 blocks for this reward"));
        inv.setItem(11, createGuiItem(Material.EMERALD_BLOCK, "§b§l200000", "§cMine 200000 blocks for this reward"));
        inv.setItem(12, createGuiItem(Material.EMERALD_BLOCK, "§b§l300000", "§cMine 300000 blocks for this reward"));
        inv.setItem(13, createGuiItem(Material.EMERALD_BLOCK, "§b§l400000", "§cMine 400000 blocks for this reward"));
        inv.setItem(14, createGuiItem(Material.EMERALD_BLOCK, "§b§l500000", "§cMine 500000 blocks for this reward"));
        inv.setItem(15, createGuiItem(Material.EMERALD_BLOCK, "§b§l1000000", "§cMine 1000000 blocks for this reward"));
        inv.setItem(16, createGuiItem(Material.EMERALD_BLOCK, "§b§l2000000", "§cMine 2000000 blocks for this reward"));
        inv.setItem(17, createGuiItem(Material.EMERALD_BLOCK, "§b§l3000000", "§cMine 3000000 blocks for this reward"));*/
        inv.setItem(size - 1, createGuiItem(Material.ARROW, "§oNext"));
        inv.setItem(31, createGuiItem(Material.BARRIER, "§oBack", "§c§oGo back to the", "§c§oquest selector"));
        ent.openInventory(inv);
    }

    public void openInventoryBlocks2(final HumanEntity ent) {
        int size = 36;
        Inventory inv = this.createGui("Blocks Mined 2/2", size);

        inv.setItem(size - 9, createGuiItem(Material.ARROW, "§oBack"));
//        inv.setItem(size - 1, createGuiItem(Material.ARROW, "§oNext"));

        /*inv.setItem(0, createGuiItem(Material.EMERALD_BLOCK, "§b§l4000000", "§cMine 4000000 blocks for this reward"));
        inv.setItem(1, createGuiItem(Material.EMERALD_BLOCK, "§b§l5000000", "§cMine 5000000 blocks for this reward"));
        inv.setItem(2, createGuiItem(Material.EMERALD_BLOCK, "§b§l10000000", "§cMine 10000000 blocks for this reward"));
        inv.setItem(3, createGuiItem(Material.EMERALD_BLOCK, "§b§l11000000", "§cMine 11000000 blocks for this reward"));
        inv.setItem(4, createGuiItem(Material.EMERALD_BLOCK, "§b§l12000000", "§cMine 12000000 blocks for this reward"));
        inv.setItem(5, createGuiItem(Material.EMERALD_BLOCK, "§b§l13000000", "§cMine 13000000 blocks for this reward"));
        inv.setItem(6, createGuiItem(Material.EMERALD_BLOCK, "§b§l14000000", "§cMine 14000000 blocks for this reward"));
        inv.setItem(7, createGuiItem(Material.EMERALD_BLOCK, "§b§l15000000", "§cMine 15000000 blocks for this reward"));
        inv.setItem(8, createGuiItem(Material.EMERALD_BLOCK, "§b§l200000000", "§cMine 20000000 blocks for this reward"));
        inv.setItem(9, createGuiItem(Material.EMERALD_BLOCK, "§b§l250000000", "§cMine 25000000 blocks for this reward"));
        inv.setItem(10, createGuiItem(Material.EMERALD_BLOCK, "§b§l260000000", "§cMine 26000000 blocks for this reward"));
        inv.setItem(11, createGuiItem(Material.EMERALD_BLOCK, "§b§l270000000", "§cMine 27000000 blocks for this reward"));
        inv.setItem(12, createGuiItem(Material.EMERALD_BLOCK, "§b§l280000000", "§cMine 28000000 blocks for this reward"));
        inv.setItem(13, createGuiItem(Material.EMERALD_BLOCK, "§b§l290000000", "§cMine 29000000 blocks for this reward"));
        inv.setItem(14, createGuiItem(Material.EMERALD_BLOCK, "§b§l300000000", "§cMine 30000000 blocks for this reward"));
        inv.setItem(15, createGuiItem(Material.EMERALD_BLOCK, "§b§l350000000", "§cMine 35000000 blocks for this reward"));
        inv.setItem(16, createGuiItem(Material.EMERALD_BLOCK, "§b§l400000000", "§cMine 40000000 blocks for this reward"));
        inv.setItem(17, createGuiItem(Material.EMERALD_BLOCK, "§b§l500000000", "§cMine 50000000 blocks for this reward"));*/

        ent.openInventory(inv);

        if(EZBlocks.getEZBlocks().getBlocksBroken((Player) ent) == 1000){
            inv.setItem(0, createGuiItem(Material.EMERALD_BLOCK, "§b§l1000", "§a§lUNLOCKED"));
        }else{
            inv.setItem(0, createGuiItem(Material.REDSTONE_BLOCK, "§b§l1000", "§cMine 1000 blocks for this reward"));
        }
    }


    protected ItemStack createGuiItem(final Material material, final String name, final String... lore) {
        final ItemStack item = new ItemStack(material);
        final ItemMeta meta = item.getItemMeta();
        // Set the name of the item
        meta.setDisplayName(name);
        // Set the lore of the item
        meta.setLore(Arrays.asList(lore));
        item.setItemMeta(meta);
        return item;
    }

    protected ItemStack createGuiItem(final Material material) {
        return new ItemStack(material);
    }

    @EventHandler
    public void onInventoryClickEvent(final InventoryClickEvent e) {
        ItemStack clickedItem = e.getCurrentItem();
        Player p = (Player) e.getWhoClicked();
        if (e.getClickedInventory().getTitle().equals("Quests")) {

            if (clickedItem.getType().equals(Material.BARRIER)) {
                p.sendMessage("§6§lYou have closed the quest tab.");
                p.closeInventory();
            }
            if (clickedItem.getType().equals(Material.DIAMOND_PICKAXE)) {
                p.closeInventory();
                openInventoryBlocks1(p);
                p.sendMessage("§6§lYou have opened the blocks tab.");
            }
            if (clickedItem.getType().equals(Material.IRON_FENCE)) {
                p.sendMessage("Coming Soon");
            }
            else {
                e.setCancelled(true);
            }
            e.setCancelled(true);
        }
        if (e.getClickedInventory().getTitle().equals("Blocks Mined 1/2")) {
            if (clickedItem.getType().equals(Material.ARROW)) {
                if(clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("§oNext")){
                    p.closeInventory();
                    openInventoryBlocks2(p);
                    e.setCancelled(true);
                }

            }
            if(clickedItem.getType().equals(Material.EMERALD_BLOCK)){
                e.setCancelled(true);
            }
            else{
                e.setCancelled(true);
            }
        }
        if(e.getClickedInventory().getTitle().equals("Blocks Mined 2/2")){
            if(clickedItem.getType().equals(Material.ARROW)){
                if(clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("§oBack")){
                    p.closeInventory();
                    openInventoryBlocks1(p);
                    e.setCancelled(true);}
            }
            if (clickedItem.getType().equals(Material.EMERALD_BLOCK)) {
                e.setCancelled(true);
            }
            else{
                e.setCancelled(true);
            }
        }

    }

}
