/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package me.Dremnor.MageWars;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Mokito
 */
public class Main extends JavaPlugin {
    
    @Override
    public void onEnable(){
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE+"@@@@@@@@@@@@@@@@@@@");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE+"@                 @");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE+"@ MageWar Enabled @");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE+"@ MageWar Enabled @");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE+"@                 @");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE+"@@@@@@@@@@@@@@@@@@@");
    }
    
    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE+"@@@@@@@@@@@@@@@@@@@@");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE+"@                  @");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE+"@ MageWar Disabled @");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE+"@ MageWar Disabled @");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE+"@                  @");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE+"@@@@@@@@@@@@@@@@@@@@");
    }
    
    
}
