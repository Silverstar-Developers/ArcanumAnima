
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcanumanima.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.arcanumanima.world.biome.DeorumLandBiome;
import net.mcreator.arcanumanima.ArcanumAnimaMod;

public class ArcanumAnimaModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, ArcanumAnimaMod.MODID);
	public static final RegistryObject<Biome> DEORUM_LAND = REGISTRY.register("deorum_land", DeorumLandBiome::createBiome);
}
