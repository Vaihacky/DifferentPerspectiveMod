package com.vaihacky.differentperspective.client;

import com.mojang.blaze3d.platform.InputConstants;
import com.vaihacky.differentperspective.DifferentPerspective;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;

public final class KeyMappings {
	private KeyMappings() {
		
	}
	
	public static KeyMapping dpFrontPerspective;
	public static KeyMapping dpBackPerspective;
	
	public static void init() {
		dpFrontPerspective = registerKey("front_perspective", KeyMapping.CATEGORY_INTERFACE, InputConstants.KEY_G);
		dpBackPerspective = registerKey("back_perspective", KeyMapping.CATEGORY_INTERFACE, InputConstants.KEY_H);
	}
	
	private static KeyMapping registerKey(String name, String category, int keycode) {
		final var key = new KeyMapping("key." + DifferentPerspective.MOD_ID + "." + name, keycode, category);
		ClientRegistry.registerKeyBinding(key);
		return key;
	}
}
