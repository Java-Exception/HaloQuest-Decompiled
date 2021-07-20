package software.tims.haloquests.classes.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import software.tims.haloquests.GUI;


public class Quests extends GUI implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (sender.hasPermission("hq.commands.quests")) {
                openInventoryMain(player);
            }

        }
        return true;
    }

}