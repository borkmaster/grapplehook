package com.unlucky.grapplehook.entity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;


public class EntityGrapple extends EntityThrowable {

	public EntityGrapple(World worldIn, EntityPlayer playerIn) {
		super(worldIn);
	}

	@Override
	protected void onImpact(MovingObjectPosition p_70184_1_) {
		
	}
	
	

}
