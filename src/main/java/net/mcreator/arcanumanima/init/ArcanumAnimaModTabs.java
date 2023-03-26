
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcanumanima.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ArcanumAnimaModTabs {
	public static CreativeModeTab TAB_ARCANUM_ANIMA;

	public static void load() {
		TAB_ARCANUM_ANIMA = new CreativeModeTab("tabarcanum_anima") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ArcanumAnimaModItems.BLANK_RUNE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
