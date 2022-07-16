package com.vaihacky.differentperspective.client.event;

import com.vaihacky.differentperspective.DifferentPerspective;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(modid = DifferentPerspective.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents{
	
	public static final KeyMapping FRONT_PERSPECTIVE = new KeyMapping(DifferentPerspective.KEY_ID +
			"front_perspective", InputConstants.KEY_H, KeyMapping.CATEGORY_INTERFACE);
	public static final KeyMapping BACK_PERSPECTIVE = new KeyMapping(DifferentPerspective.KEY_ID +
			"back_perspective", InputConstants.KEY_G, KeyMapping.CATEGORY_INTERFACE);
	
	@SubscribeEvent
	public static void init(RegisterKeyMappingsEvent event) {
		event.register(FRONT_PERSPECTIVE);
		event.register(BACK_PERSPECTIVE);
	}
}