package io.github.alexksysx.simplerhomes.commands;

import io.github.alexksysx.simplerhomes.HomeFile;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Home implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player player){
            if(args.length > 1) return false;
            HomeFile h = new HomeFile();
            String home = args.length == 0 ? "default" : args[0];
            h.home(player, home);
        } else {
            sender.sendMessage("Command must be executed by a player.");
        }
        return true;
    }
}
