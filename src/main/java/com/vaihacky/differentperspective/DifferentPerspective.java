package com.vaihacky.differentperspective;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(DifferentPerspective.MOD_ID)
public class DifferentPerspective {
	
	public static final String MOD_ID = "differentperspective";
	public static final String KEY_ID = "key.differentperspective."; 
	
	public DifferentPerspective() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
