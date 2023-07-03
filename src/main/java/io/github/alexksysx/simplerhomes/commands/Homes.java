package io.github.alexksysx.simplerhomes.commands;

import io.github.alexksysx.simplerhomes.HomeFile;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Homes implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player player){
            HomeFile h = new HomeFile();
            h.homes(player);
        } else {
            sender.sendMessage("Command must be executed by a player.");
        }
        return true;
    }
}
