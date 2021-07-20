package software.tims.haloquests;

import me.clip.ezblocks.EZBlocks;
import me.clip.ezprestige.EZPrestige;
import me.clip.ezprestige.PrestigeManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import software.tims.haloquests.classes.commands.Quests;
import software.tims.haloquests.classes.commands.nextPrestige;
import software.tims.haloquests.classes.commands.blocksBroken;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        PluginManager pm = Bukkit.getServer().getPluginManager();
        pm.registerEvents(new GUI(), this);

        getCommand("quests").setExecutor(new Quests());
        getCommand("nextPres").setExecutor(new nextPrestige());
        getCommand("blocksBroken").setExecutor(new blocksBroken());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Halo Quests is now Disabled");
    }
}
