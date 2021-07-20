package software.tims.haloquests.classes.commands;

import me.clip.ezblocks.EZBlocks;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class blocksBroken implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            sender.sendMessage(ChatColor.AQUA + "You've Broken " + ChatColor.WHITE + EZBlocks.getEZBlocks().getBlocksBroken(player) + ChatColor.AQUA + " Blocks");
            return true;
        }

        return false;
    }
}
