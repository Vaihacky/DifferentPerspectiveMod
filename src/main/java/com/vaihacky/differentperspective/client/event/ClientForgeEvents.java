package com.vaihacky.differentperspective.client.event;

import com.vaihacky.differentperspective.DifferentPerspective;
import com.vaihacky.differentperspective.client.KeyMappings;

import net.minecraft.client.Minecraft;
import net.minecraft.client.CameraType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = DifferentPerspective.MOD_ID, bus = Bus.FORGE, value = Dist.CLIENT)
public final class ClientForgeEvents {
	private ClientForgeEvents() {
		
	}
	
	@SubscribeEvent
	public static void clientTick(ClientTickEvent event) {
		final var mc = Minecraft.getInstance();
		while(KeyMappings.BACK_PERSPECTIVE.consumeClick()) {
			if (mc.options.getCameraType().isFirstPerson()
                    || mc.options.getCameraType().equals(CameraType.THIRD_PERSON_FRONT)) {
				mc.options.setCameraType(CameraType.THIRD_PERSON_BACK);
            } else {
            	mc.options.setCameraType(CameraType.FIRST_PERSON);
            }
        }
		
		while(KeyMappings.FRONT_PERSPECTIVE.consumeClick()) {
			if (mc.options.getCameraType().isFirstPerson()
                    || mc.options.getCameraType().equals(CameraType.THIRD_PERSON_BACK)) {
				mc.options.setCameraType(CameraType.THIRD_PERSON_FRONT);
            } else {
            	mc.options.setCameraType(CameraType.FIRST_PERSON);
            }
        }
	};
}
