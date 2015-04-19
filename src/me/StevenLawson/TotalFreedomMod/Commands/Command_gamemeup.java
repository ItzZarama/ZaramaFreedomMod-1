package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "Plays ping pong with you", usage = "/<command>")
public class Command_gamemeup extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(ChatColor.GREEN + "Ping");
        sender.sendMessage(ChatColor.BLUE + "Pong");
        sender.sendMessage(ChatColor.GREEN + "Ping");
        sender.sendMessage(ChatColor.BLUE + "Pong");
        sender.sendMessage(ChatColor.GREEN + "Ping");
        sender.sendMessage(ChatColor.BLUE + "Pong");
        sender.sendMessage(ChatColor.GREEN + "Ping");
        sender.sendMessage(ChatColor.BLUE + "Pong");
        sender.sendMessage(ChatColor.GREEN + "Ping");
        sender.sendMessage(ChatColor.BLUE + "Pong");
        sender.sendMessage(ChatColor.GREEN + "Ping");
        sender.sendMessage(ChatColor.BLUE + "Pong");
        sender.sendMessage(ChatColor.GREEN + "Ping");
        sender.sendMessage(ChatColor.BLUE + "Pong");
        
