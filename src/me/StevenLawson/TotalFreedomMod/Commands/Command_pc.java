package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "Clears your  chat!", usage = "/<command>")
public class Command_pc extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
        sender.sendMessage(" ");
