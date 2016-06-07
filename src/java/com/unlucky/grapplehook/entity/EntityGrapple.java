package com.unlucky.grapplehook.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;


public class EntityGrapple extends EntityThrowable {
	
	
	public EntityGrapple(World par1World, double par2, double par4, double par6) {
		super(par1World, par2, par4, par6);
	}
	
	public EntityGrapple(World par1World, EntityLivingBase par2EntityLivingBase) {
		super(par1World, par2EntityLivingBase);
	}
	
	public EntityGrapple(World par1World) {
		super(par1World);
	}
	
	@Override
	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	
	protected void onImpact(MovingObjectPosition mop) {
		System.out.println("Entity landed!");
	}
	
	

}
