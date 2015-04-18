package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "Show info about ZaramaFreedomMod", usage = "/<command>")
public class Command_zfm extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(ChatColor.GREEN + "This ZaramaFreedomMod is currently a fork from TotalFreedomMod!");
        sender.sendMessage(ChatColor.GOLD + "To Make your own FreedomMod, visit https://github.com/TotalFreedom/TotalFreedomMod for more info!");
        sender.sendMessage(ChatColor.PURPLE + "Our Main Developers of this ZFM are Alex333856 and DaBoyTM");
        sender.sendMessage(ChatColor.RED + "ZFM Version: v2.4");
        sender.sendMessage(ChatColor.BLUE + "For more info, please visit our forum at http://zaramafreedom.proboards.com/");
        sender.sendMessage(ChatColor.BLUE + "Or contact to one of our Developers :)");
        sender.sendMessage(ChatColor.BLUE + "If you would like something added, Please make an Pull request or if you find a issue go to" + ChatColor.GOLD + " http://github.com/AlexFreedomMod/ZaramaFreedomMod/issues"
  }
