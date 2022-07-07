package com.vaihacky.differentperspective.client.event;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import com.vaihacky.differentperspective.DifferentPerspective;
import com.vaihacky.differentperspective.client.KeyMappings;

@Mod.EventBusSubscriber(modid = DifferentPerspective.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents{

	private ClientModEvents() {
	}
	
	@SubscribeEvent 
	public static void clientSetup(FMLClientSetupEvent event){	
		KeyMappings.init();
	}
}