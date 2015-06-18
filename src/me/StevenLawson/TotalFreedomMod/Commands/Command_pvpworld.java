package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.Config.TFM_ConfigEntry;
import me.StevenLawson.TotalFreedomMod.World.ZFM_PvpWorld;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Telports the sender to the PvpWorld", usage = "/<command>")
public class Command_pvpworld extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (TFM_ConfigEntry.FLATLANDS_GENERATE.getBoolean())
        {
            ZFM_PvpWorld.getInstance().sendToWorld(sender_p);
            sender_p.setOp(false);
            sender_p.sendMessage(ChatColor.RED + "If you dont have your stuff ready yet... then sorry ");
            sender_p.sendMessage(ChatColor.GRAY + sender.getName() + ", you have been deoped and put in survival to pvp");
            sender_p.setGameMode(GameMode.SURVIVAL);
        }
        else
        {
            playerMsg("Sorry, mate. Pvpworld is disabled ");
            playerMsg("If it is enabled and this is happening report it to a developer");
        }
        return true;
    }
}
