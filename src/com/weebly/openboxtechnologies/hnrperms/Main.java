package com.weebly.openboxtechnologies.hnrperms;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by zhiyuanqi on 17/05/16.
 */

public class Main extends JavaPlugin {

    private static final ChatMessages chatMessages = new ChatMessages();

    public static HashMap<UUID,PermissionAttachment> playerHashmap = new HashMap<>();

    //TODO Add SQL Permission Storage and Rank Storage

    @Override
    public void onEnable() {
        new Listener(this);
    }

    @Override
    public void onDisable() {
        playerHashmap.clear();
    }

    @Override
    public boolean onCommand(CommandSender e, Command command, String label, String[] args) {
        if (!command.getName().equalsIgnoreCase("hnrperms")) {
            return false;
        }

        if (!e.hasPermission("rank.admin")) {
            e.sendMessage(chatMessages.permError);
        }

        if (args.length == 0) {
            e.sendMessage(chatMessages.helpChat);
            return true;
        } else if (args.length == 1) {
            //TODO Missing argument PLAYER
            return true;
        } else if (args.length == 2) {
            //TODO Missing argument RANK
            return true;
        }

        if (args[0].equalsIgnoreCase("setrank")) {
            //TODO Handle Set rank
        } else if (args[0].equalsIgnoreCase("addrank")) {
            //TODO Handle Add rank
        } else if (args[0].equalsIgnoreCase("removerank")) {
            //TODO Handle Remove rank
        } else {
            //TODO Handle unknown argument
        }

        return true;
    }

}
