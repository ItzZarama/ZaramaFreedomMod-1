package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "Manager command (TROLL COMMAND)", usage = "/<command>")
public class Command_pex extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
       sender.sendMessage(ChatColor.GREEN + "Why do you want admin so bad???");
       sender.sendMessage(ChatColor.BLUE + "You might as well apply!!!!");
       sender.sendMessage(ChatColor.GREEN + "I Can't belive you even tryed to super your self");
       sender.sendMessage(ChatColor.BLUE + "Try using /Manuadd, Thats what you use to super your self here");
       # Manuadd will troll them even more :), untill they find /saconfig :) 
       
    }
    
    return true;
    
