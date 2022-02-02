package com.goldenugh.runecraft.Classes.Packets;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.PacketDistributor.PacketTarget

import java.util.function.Supplier;

import static com.goldenugh.runecraft.Classes.Packets.PacketHandler._PacketHandler;

public class ExpUpdatePacket implements IPacket {
    // Stores information regarding an event where Exp is gained and needs
    // to update the client values on the screen.

    FriendlyByteBuf buffer;


    public void handle(IPacket packet, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> ClientProxy.handlePacket(msg, ctx))
        });
        ctx.get().setPacketHandled(true);
    }

    public void write(IPacket p, PacketTarget t) {
        MSG_PacketHandler.encodeMessage(p, buffer);
        _PacketHandler.send();
    }

}
