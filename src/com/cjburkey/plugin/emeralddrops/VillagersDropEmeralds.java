package com.cjburkey.plugin.emeralddrops;

import org.bukkit.plugin.java.JavaPlugin;

public class VillagersDropEmeralds extends JavaPlugin {
	
	public static VillagersDropEmeralds instance;
	public static int emeraldChance;
	public static int minEmeralds;
	public static int maxEmerals;
	public static int exp;
	
	public void onEnable() {
		instance = this;
		
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		
		emeraldChance = this.getConfig().getInt("emeraldChancePercent");
		minEmeralds = this.getConfig().getInt("emeraldMin");
		maxEmerals = this.getConfig().getInt("emeraldMax");
		exp = this.getConfig().getInt("xpDropped");
		
		this.getServer().getPluginManager().registerEvents(new HandleEntityDeath(), this);
	}
	
}