package com.unlucky.grapplehook.item;

import com.unlucky.grapplehook.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems {
	
	public static Item grappleHook;

	public static final void init() {
		
		//Registering items from the mod
		grappleHook = new GrappleHookBase()
					.setUnlocalizedName("grappleHook")
					.setCreativeTab(CreativeTabs.tabTools)
					.setTextureName(Main.MODID + ":grappleHook");
		GameRegistry.registerItem(grappleHook, "grappleHook");
	}

}
