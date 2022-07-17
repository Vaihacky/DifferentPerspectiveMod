package com.vaihacky.differentperspective.client;

import com.mojang.blaze3d.platform.InputConstants;
import com.vaihacky.differentperspective.DifferentPerspective;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;

public final class KeyMappings {
	private KeyMappings() {
		
	}
	
	public static KeyMapping FRONT_PERSPECTIVE;
	public static KeyMapping BACK_PERSPECTIVE;
	
	public static void init() {
		FRONT_PERSPECTIVE = registerKey("front_perspective", KeyMapping.CATEGORY_INTERFACE, InputConstants.KEY_H);
		BACK_PERSPECTIVE = registerKey("back_perspective", KeyMapping.CATEGORY_INTERFACE, InputConstants.KEY_G);
	}
	
	private static KeyMapping registerKey(String name, String category, int keycode) {
		final var key = new KeyMapping(DifferentPerspective.KEY_ID + name, keycode, category);
		ClientRegistry.registerKeyBinding(key);
		return key;
	}
}