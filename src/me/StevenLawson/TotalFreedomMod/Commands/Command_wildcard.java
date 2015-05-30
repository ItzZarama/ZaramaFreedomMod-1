package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_CommandBlocker;
import me.StevenLawson.TotalFreedomMod.TFM_Log;
import org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Run any command on all users, username placeholder = ?.", usage = "/<command> [fluff] ? [fluff] ?")
public class Command_wildcard extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length == 0)
        {
            return false;
        }

        if (args[0].equals("wildcard"))
        {
            playerMsg("No Thanks", ChatColor.RED);
            return true;
        }
        if (args[0].equals("gtfo"))
        {
            playerMsg("Woah Mate, that is just evil for ops to ban someone!", ChatColor.RED);
            return true;
        }
        if (args[0].equals("doom"))
        {
            playerMsg("Doom is not for you, doom doesn't fix anyone!", ChatColor.RED);
            return true;
        }
        if (args[0].equals("saconfig"))
        {
            playerMsg("COMPLETE FAIL! Please, just no.", ChatColor.RED);
            sender.setOp(false);
            return true;
        }
        // This should not be unblocked
        
        if (args[0].equals("alexmanage"))
        {
            playerMsg("Can I help you?", ChatColor.RED);
            return true;
        }
        // Don't unblock this, its very EVILLL
        
        if (args[0].equals("alexdoom"))
        {
            playerMsg("This Doom cannot fix anyone!", ChatColor.RED);
            return true;
            
        }
         
        if (args[0].equals("glist"))
        {
            playerMsg("[WARNING]" + sender.getName() + "has tryed to wildcard /glist :O");
            TFM_Log.info("GANGSTER ALERT!!!!!!!!!!!!!!!!!!!!" + sender.getName() + "is a gangster!");
            return true;
            
        }
        
        String baseCommand = StringUtils.join(args, " ");

        if (TFM_CommandBlocker.isCommandBlocked(baseCommand, sender))
        {
            // CommandBlocker handles messages and broadcasts
            return true;
        }

        for (Player player : server.getOnlinePlayers())
        {
            String out_command = baseCommand.replaceAll("\\x3f", player.getName());
            playerMsg("Running Command: " + out_command);
            server.dispatchCommand(sender, out_command);
        }

        return true;
    }
}
