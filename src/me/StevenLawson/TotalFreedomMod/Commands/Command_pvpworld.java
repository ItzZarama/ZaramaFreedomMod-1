package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.Config.TFM_ConfigEntry;
import me.StevenLawson.TotalFreedomMod.World.TFM_PvpWorld;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Telports the sender to the PvpWorld", usage = "/<command>")
public class Command_pvplands extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (TFM_ConfigEntry.FLATLANDS_GENERATE.getBoolean())
        {
            TFM_pvpworld.getInstance().sendToWorld(sender_p);
            player.setOp(false);
            player.sendMessage(ChatColor.RED + "To pvp we hoped you had your stuff all ready :/");
            players.sendMessage(ChatColor.GRAY + player.getName + "has put you in survival!");
            player.setGameMode(GameMode.SURVIVAL)
        }
        else
        {
            playerMsg("Sorry, the Pvp world is disabled");
            playerMsg("Please report this issue to the Developers");
        }
        return true;
    }
}
