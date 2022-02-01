package com.goldenugh.runecraft.Classes;

import java.util.UUID;

public class Player {
    UUID uuid;
    String name;
    int playerxp = 0;

    public Player(String name, int playerxp) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.playerxp = playerxp;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getPlayerxp() {
        return playerxp;
    }
    public void setPlayerxp(int playerxp) {
        this.playerxp = playerxp;
    }
}
