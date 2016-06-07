package com.unlucky.grapplehook.item;

import com.unlucky.grapplehook.entity.EntityGrapple;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GrappleHookBase extends Item {
	
	public int maxStackSize = 1;
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemIn, World worldIn, EntityPlayer playerIn) {
		
		worldIn.playSoundAtEntity(playerIn, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		
		if (!worldIn.isRemote) {
			worldIn.spawnEntityInWorld(new EntityGrapple(worldIn, playerIn));
		}
		
		return itemIn;
		
	}
	
}
