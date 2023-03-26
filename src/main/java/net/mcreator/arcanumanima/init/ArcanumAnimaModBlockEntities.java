
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcanumanima.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.arcanumanima.block.entity.InfusionTableBlockEntity;
import net.mcreator.arcanumanima.ArcanumAnimaMod;

public class ArcanumAnimaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ArcanumAnimaMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> INFUSION_TABLE = register("infusion_table", ArcanumAnimaModBlocks.INFUSION_TABLE, InfusionTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
