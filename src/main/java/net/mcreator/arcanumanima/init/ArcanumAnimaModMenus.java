
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcanumanima.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.arcanumanima.world.inventory.InfusionAltarMenu;
import net.mcreator.arcanumanima.ArcanumAnimaMod;

public class ArcanumAnimaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ArcanumAnimaMod.MODID);
	public static final RegistryObject<MenuType<InfusionAltarMenu>> INFUSION_ALTAR_GUI = REGISTRY.register("infusion_altar_gui", () -> IForgeMenuType.create(InfusionAltarMenu::new));
}
