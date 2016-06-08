package com.dapasta.notpong.packets.server;

import com.dapasta.notpong.packets.Packet;

public class GameInfoPacket extends Packet {
    public String sessionId;
    public String gameName;
    public int playerSize;
    public String creatorName;


    public float fieldSize;
    public float paddleWidth;
    public float paddleHeight;
    public float ballRadius;
}
