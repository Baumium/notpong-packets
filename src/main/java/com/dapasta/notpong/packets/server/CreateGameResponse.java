package com.dapasta.notpong.packets.server;

import com.dapasta.notpong.packets.Packet;

public class CreateGameResponse extends Packet {

    public String gameId;
    public String gameName;
    public String creatorName;
    public String sessionId;
}
