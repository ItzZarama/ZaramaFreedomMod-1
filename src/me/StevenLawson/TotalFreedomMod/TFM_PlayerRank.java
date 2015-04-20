package me.StevenLawson.TotalFreedomMod;

import me.StevenLawson.TotalFreedomMod.Config.TFM_ConfigEntry;
import static me.StevenLawson.TotalFreedomMod.TFM_Util.DEVELOPERS;
import static me.StevenLawson.TotalFreedom.TFM_Util.ZFM_DEVELOPERS;
import static me.StevenLawson.TotalFreedom.TFM_Util.FOUNDERS;
import static me.StevenLawson.TotalFreedom.TFM_Util.SYSADMIN;
import static me.StevenLawson.TotalFreedom.TFM_Util.HELPERS;
import static me.StevenLawson.TotalFreedomMod.TFM_Util.TRYADMINS;
import static me.StevenLawson.TotalFreedomMod.TFM_Util.ZFM_LeadDevelopers
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public enum TFM_PlayerRank
{
    DEVELOPER("A " + ChatColor.DARK_PURPLE + "Developer", ChatColor.DARK_PURPLE + "[Dev]"),
    IMPOSTOR("An " + ChatColor.YELLOW + ChatColor.UNDERLINE + "Impostor", ChatColor.YELLOW.toString() + ChatColor.UNDERLINE + "[IMP]"),
    NON_OP("a " + ChatColor.GREEN + "Non-OP", ChatColor.GREEN.toString()),
    OP("An " + ChatColor.RED + "OP", ChatColor.RED + "[Operator]"),
    SUPER("A " + ChatColor.GOLD + "Super Admin", ChatColor.GOLD + "[SA]"),
    TELNET("A " + ChatColor.DARK_GREEN + "Super Telnet Admin", ChatColor.DARK_GREEN + "[STA]"),
    SENIOR("A " + ChatColor.LIGHT_PURPLE + "Senior Admin", ChatColor.LIGHT_PURPLE + "[SrA]"),
    OWNER("The " + ChatColor.BLUE + "Owner", ChatColor.BLUE + "[Owner]"),
    CONSOLE("The " + ChatColor.DARK_PURPLE + "Console", ChatColor.DARK_PURPLE + "[Console]"),
    ZFM_DEVELOPERS("a " + ChatColor.DARK_PURPLE + "Developer!", ChatColor.DARK_PURPLE + "[Developer]"),
    FOUNDERS("The " + ChatColor.DARK_RED + "Founder Of Zarama Freedom", ChatColor.DARK_RED + "[Founder]"),
    SYSADMIN("A " + ChatColor.GREEN + "System Admin", ChatColor.GREEN + "[SysAdmin]"),
    HELPERS("A " + ChatColor.RED + "Helper", ChatColor.RED + "[Helper]"),
    TRYADMINS("A" + ChatColor.GOLD + "Trial Super Admin", ChatColor.YELLOW + "[TRIALADMIN]"),
    ZFM_LeadDevelopers("The" + ChatColor.DARK_PURPLE + "Lead Develope!", ChatColor.DARK_PURPLE + "[Lead Developer]");
    private final String loginMessage;
    private final String prefix;

    private TFM_PlayerRank(String loginMessage, String prefix)
    {
        this.loginMessage = loginMessage;
        this.prefix = prefix;
    }

    public static String getLoginMessage(CommandSender sender)
    {
        // Handle console
        if (!(sender instanceof Player))
        {
            return fromSender(sender).getLoginMessage();
        }

        // Handle admins
        final TFM_Admin entry = TFM_AdminList.getEntry((Player) sender);
        if (entry == null)
        {
            // Player is not an admin
            return fromSender(sender).getLoginMessage();
        }

        // Custom login message
        final String loginMessage = entry.getCustomLoginMessage();

        if (loginMessage == null || loginMessage.isEmpty())
        {
            return fromSender(sender).getLoginMessage();
        }

        return ChatColor.translateAlternateColorCodes('&', loginMessage);
    }

    public static TFM_PlayerRank fromSender(CommandSender sender)
    {
        if (!(sender instanceof Player))
        {
            return CONSOLE;
        }

        if (TFM_AdminList.isAdminImpostor((Player) sender))
        {
            return IMPOSTOR;
        }

        if (DEVELOPERS.contains(sender.getName()))
        {
            return DEVELOPER;
        }
        
        if (ZFM_DEVELOPERS.contains(sender.getName()))
        {
            return ZFM_DEVELOPERS;
        }
        
        if (FOUNDERS.contains(sender.getName()))
        {
            return FOUNDERS;
        }
         
        if (SYSADMIN.contains(sender.getName()))
        {
            return SYSADMIN;
        }
        
        if (HELPERS.contains(sender.getName()))
        {
            return HELPERS;
        }

        if (TRYADMINS.contains(sender.getName()))
        {
            return TRYADMINS;
        }
        
        if (ZFM_LeadDeveloper.contains(sender.getName()))
        {
            return ZFM_LeadDeveloper;
        {
        final TFM_Admin entry = TFM_AdminList.getEntryByIp(TFM_Util.getIp((Player) sender));

        final TFM_PlayerRank rank;

        if (entry != null && entry.isActivated())
        {
            if (TFM_ConfigEntry.SERVER_OWNERS.getList().contains(sender.getName()))
            {
                return OWNER;
            }

            if (entry.isSeniorAdmin())
            {
                rank = SENIOR;
            }
            else if (entry.isTelnetAdmin())
            {
                rank = TELNET;
            }
            else
            {
                rank = SUPER;
            }
        }
        else
        {
            if (sender.isOp())
            {
                rank = OP;
            }
            else
            {
                rank = NON_OP;
            }

        }
        return rank;
    }

    public String getPrefix()
    {
        return prefix;
    }

    public String getLoginMessage()
    {
        return loginMessage;
    }
}
