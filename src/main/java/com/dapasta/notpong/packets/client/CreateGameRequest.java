package com.dapasta.notpong.packets.client;

import com.dapasta.notpong.packets.Packet;

public class CreateGameRequest extends Packet {

    // Creator info
    public String creatorName;

    // Game info
    public String gameName;
    public int gameSize;
}
