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
        sender.sendMessage(ChatColor.BLUE + "Step 1:" + ChatColor.GREEN + " Make an account on forums");
        sender.sendMessage(ChatColor.BLUE + "Step 2:" + ChatColor.GREEN + " Wait 30 Days ");
        sender.sendMessage(ChatColor.BLUE + "Step 3:" + ChatColor.GREEN + " Create An Application! ");
        sender.sendMessage(ChatColor.BLUE + "Step 4:" + ChatColor.GREEN + " Wait for about 3 days ");
        sender.sendMessage(ChatColor.BLUE + "Step 5:" + ChatColor.GREEN + " Your app will be accepted or denied ");
        sender.sendMessage(ChatColor.BLUE + "Tip #1" + ChatColor.GREEN + " If it is denied, Please join an admin crew ");
        sender.sendMessage(ChatColor.BLUE + "Tip #2:" + ChatColor.GREEN + "If it is accepted, You will be supered in " + ChatColor.GOLD + "10 Days");
    } 
    
    return true;
}
