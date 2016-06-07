package com.unlucky.grapplehook.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;

public class EventHandlerCommon {

	@SubscribeEvent
	public void onPlayerUseItemEvent (PlayerUseItemEvent.Start e) {
		
		//System.out.println(e.entityPlayer);
		
		
	}

}
