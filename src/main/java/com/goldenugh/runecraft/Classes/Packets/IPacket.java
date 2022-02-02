package com.goldenugh.runecraft.Classes.Packets;

public interface IPacket {
    void handle(IPacket p);

    void write(IPacket p);
}
