package com.cjburkey.plugin.emeralddrops;

import org.bukkit.plugin.java.JavaPlugin;

public class VillagersDropEmeralds extends JavaPlugin {
	
	public static VillagersDropEmeralds instance;
	public static int emeraldChance;
	public static int minEmeralds;
	public static int maxEmeralds;
	public static int exp;
	
	public void onEnable() {
		instance = this;
		
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		
		loadConfig();
		if(emeraldChance < 0) { emeraldChance = 0; }
		if(emeraldChance > 100) { emeraldChance = 100; }
		if(minEmeralds < 0) { minEmeralds = 0; }
		if(minEmeralds > 64) { minEmeralds = 64; }
		if(maxEmeralds < 1) { maxEmeralds = 1; }
		if(maxEmeralds > 64) { maxEmeralds = 64; }
		if(exp < 0) { exp = 0; }
		if(exp > 100) { exp = 100; }
		
		this.getServer().getPluginManager().registerEvents(new HandleEntityDeath(), this);
	}
	
	private void loadConfig() {
		emeraldChance = this.getConfig().getInt("emeraldChancePercent");
		minEmeralds = this.getConfig().getInt("emeraldMin");
		maxEmeralds = this.getConfig().getInt("emeraldMax");
		exp = this.getConfig().getInt("xpDropped");
	}
	
}