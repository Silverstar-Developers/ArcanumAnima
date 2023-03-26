
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcanumanima.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.arcanumanima.item.WoodenAthameItem;
import net.mcreator.arcanumanima.item.StoneAthameItem;
import net.mcreator.arcanumanima.item.SteelItem;
import net.mcreator.arcanumanima.item.OverworldSoulItem;
import net.mcreator.arcanumanima.item.NetheriteAthameItem;
import net.mcreator.arcanumanima.item.NetherSoulItem;
import net.mcreator.arcanumanima.item.IronAthameItem;
import net.mcreator.arcanumanima.item.GoldenAthameItem;
import net.mcreator.arcanumanima.item.EndSoulItem;
import net.mcreator.arcanumanima.item.DiamondAthameItem;
import net.mcreator.arcanumanima.item.BossSoulItem;
import net.mcreator.arcanumanima.item.BlankRuneItem;
import net.mcreator.arcanumanima.ArcanumAnimaMod;

public class ArcanumAnimaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ArcanumAnimaMod.MODID);
	public static final RegistryObject<Item> BLANK_RUNE = REGISTRY.register("blank_rune", () -> new BlankRuneItem());
	public static final RegistryObject<Item> INFUSION_TABLE = block(ArcanumAnimaModBlocks.INFUSION_TABLE, ArcanumAnimaModTabs.TAB_ARCANUM_ANIMA);
	public static final RegistryObject<Item> OVERWORLD_SOUL = REGISTRY.register("overworld_soul", () -> new OverworldSoulItem());
	public static final RegistryObject<Item> NETHER_SOUL = REGISTRY.register("nether_soul", () -> new NetherSoulItem());
	public static final RegistryObject<Item> END_SOUL = REGISTRY.register("end_soul", () -> new EndSoulItem());
	public static final RegistryObject<Item> BOSS_SOUL = REGISTRY.register("boss_soul", () -> new BossSoulItem());
	public static final RegistryObject<Item> STEEL = REGISTRY.register("steel", () -> new SteelItem());
	public static final RegistryObject<Item> WOODEN_ATHAME = REGISTRY.register("wooden_athame", () -> new WoodenAthameItem());
	public static final RegistryObject<Item> GOLDEN_ATHAME = REGISTRY.register("golden_athame", () -> new GoldenAthameItem());
	public static final RegistryObject<Item> STONE_ATHAME = REGISTRY.register("stone_athame", () -> new StoneAthameItem());
	public static final RegistryObject<Item> IRON_ATHAME = REGISTRY.register("iron_athame", () -> new IronAthameItem());
	public static final RegistryObject<Item> DIAMOND_ATHAME = REGISTRY.register("diamond_athame", () -> new DiamondAthameItem());
	public static final RegistryObject<Item> NETHERITE_ATHAME = REGISTRY.register("netherite_athame", () -> new NetheriteAthameItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
