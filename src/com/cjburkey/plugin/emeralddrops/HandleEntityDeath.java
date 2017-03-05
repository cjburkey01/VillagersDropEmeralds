package com.cjburkey.plugin.emeralddrops;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class HandleEntityDeath implements Listener {
	
	@EventHandler
	public void onEntityDie(EntityDeathEvent e) {
		if(e.getEntityType().equals(EntityType.VILLAGER)) {
			if(Util.randonRangeInc(1, 100) <= VillagersDropEmeralds.emeraldChance) {
				int amt = Util.randonRangeInc(VillagersDropEmeralds.minEmeralds, VillagersDropEmeralds.maxEmeralds);
				e.getDrops().add(new ItemStack(Material.EMERALD, amt));
			}
			e.setDroppedExp(VillagersDropEmeralds.exp);
		}
	}
	
}