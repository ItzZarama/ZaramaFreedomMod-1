package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "Another troll command :)", usage = "/<command>")
public class Command_manuadd extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(ChatColor.RESET + "Usage: /manuadd <player> <rank>");
        sender.sendMessage(ChatColor.GREEN + "Why do you want admin???");
        sender.sendMessage(ChatColor.GREEN + "Just Apply!!!");
        
