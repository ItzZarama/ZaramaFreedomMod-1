package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "This will show you all about how to apply", usage = "/<command>")
public class Command_ai extends TFM_Command
{
    // Doesn't care if its a console, because the person behind the console is  a player :)
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
    // Sends the player a message
        sender.sendMessage(ChatColor.GREEN + "Admin Application Info");
        sender.sendMessage(ChatColor.BLUE + "Step 1:" + ChatColor.GREEN + " Make an account on forums at http://zaramafreedom.proboards.com/");
        sender.sendMessage(ChatColor.BLUE + "Step 2:" + ChatColor.GREEN + " Wait 30 Days ");
        sender.sendMessage(ChatColor.BLUE + "Step 3:" + ChatColor.GREEN + " Create An Application! ");
        sender.sendMessage(ChatColor.BLUE + "Step 4:" + ChatColor.GREEN + " And just wait!");
    } 
    
    return true;
}
