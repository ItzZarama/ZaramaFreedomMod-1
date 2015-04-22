package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.ONLY_CONSOLE, blockHostConsole = true)
@CommandParameters(description = "Wipe the flatlands map. Requires manual restart after command is used.", usage = "/<command>")
public class Command_wipeflatlands extends TFM_Command
{
    @Override
    public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        TFM_Util.setSavedFlag("do_wipe_flatlands", true);

        TFM_Util.bcastMsg("[Server:CONSOLE] Wiping flatlands.", ChatColor.PURPLE);

        for (Player player : server.getOnlinePlayers())
        {
            player.kickPlayer("Server: Flatlands wipe are in progress! Come back in couple of mins.");
        }

        server.shutdown();

        return true;
    }
}
