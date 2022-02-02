package com.goldenugh.runecraft.Classes.Packets;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class PacketHandler {

    // From Forge docs directly - the SimpleImpl class that allows us to handle packets
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel _PacketHandler = NetworkRegistry.newSimpleChannel(
            new ResourceLocation("runecraft", "main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );

    private int MESSAGE_ID = 0;

    public void init() {
        _PacketHandler.registerMessage(MESSAGE_ID++, );
    }
}
