package com.goldenugh.runecraft;

import com.goldenugh.runecraft.Classes.RegistryHandler;
import net.minecraftforge.fml.common.Mod;

@Mod(RuneCraft.MODID)
public class RuneCraft {
	public static final String MODID = "runecraft";
	
	public RuneCraft() {
		RegistryHandler.initEvents();
	}
	
	
}
