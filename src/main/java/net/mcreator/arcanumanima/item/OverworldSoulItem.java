
package net.mcreator.arcanumanima.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.arcanumanima.init.ArcanumAnimaModTabs;

public class OverworldSoulItem extends Item {
	public OverworldSoulItem() {
		super(new Item.Properties().tab(ArcanumAnimaModTabs.TAB_ARCANUM_ANIMA).stacksTo(64).rarity(Rarity.COMMON));
	}
}
