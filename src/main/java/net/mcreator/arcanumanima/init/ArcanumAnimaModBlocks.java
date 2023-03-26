
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcanumanima.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.arcanumanima.block.InfusionTableBlock;
import net.mcreator.arcanumanima.ArcanumAnimaMod;

public class ArcanumAnimaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ArcanumAnimaMod.MODID);
	public static final RegistryObject<Block> INFUSION_TABLE = REGISTRY.register("infusion_table", () -> new InfusionTableBlock());
}
