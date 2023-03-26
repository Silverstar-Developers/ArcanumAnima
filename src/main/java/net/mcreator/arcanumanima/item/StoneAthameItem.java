
package net.mcreator.arcanumanima.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.arcanumanima.init.ArcanumAnimaModTabs;

public class StoneAthameItem extends SwordItem {
	public StoneAthameItem() {
		super(new Tier() {
			public int getUses() {
				return 131;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.COBBLED_DEEPSLATE), new ItemStack(Blocks.COBBLESTONE), new ItemStack(Blocks.BLACKSTONE));
			}
		}, 3, -2.7f, new Item.Properties().tab(ArcanumAnimaModTabs.TAB_ARCANUM_ANIMA));
	}
}
