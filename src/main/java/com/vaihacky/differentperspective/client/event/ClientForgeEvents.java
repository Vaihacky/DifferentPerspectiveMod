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
		final var options = Minecraft.getInstance().options;
		while(KeyMappings.dpBackPerspective.consumeClick()) {
			if (options.getCameraType().isFirstPerson()
                    || options.getCameraType().equals(CameraType.THIRD_PERSON_FRONT)) {
                options.setCameraType(CameraType.THIRD_PERSON_BACK);
            } else {
                options.setCameraType(CameraType.FIRST_PERSON);
            }
        }
		
		while(KeyMappings.dpFrontPerspective.consumeClick()) {
			if (options.getCameraType().isFirstPerson()
                    || options.getCameraType().equals(CameraType.THIRD_PERSON_BACK)) {
                options.setCameraType(CameraType.THIRD_PERSON_FRONT);
            } else {
                options.setCameraType(CameraType.FIRST_PERSON);
            }
        }
	};
}
