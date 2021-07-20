package software.tims.haloquests.classes.commands;

import me.clip.ezprestige.PrestigeManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class nextPrestige implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            sender.sendMessage(ChatColor.AQUA + "Your Next Prestige is || " + ChatColor.WHITE + PrestigeManager.getNextPrestigeTag(player));
            return true;
        }


        return false;
    }
}
