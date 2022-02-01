package com.goldenugh.runecraft.Classes;

import com.goldenugh.runecraft.Events.onJoinEvent;
import net.minecraftforge.common.MinecraftForge;

public class RegistryHandler {
    public static void initEvents() {
        MinecraftForge.EVENT_BUS.register(onJoinEvent.class);
    }
}
