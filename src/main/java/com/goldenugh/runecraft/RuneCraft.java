package com.goldenugh.runecraft;

import com.goldenugh.runecraft.Events.onJoinEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(RuneCraft.MODID)
public class RuneCraft {
	public static final String MODID = "runecraft";
	
	public RuneCraft() {
		MinecraftForge.EVENT_BUS.register(onJoinEvent.class);
	}
	
	
}
