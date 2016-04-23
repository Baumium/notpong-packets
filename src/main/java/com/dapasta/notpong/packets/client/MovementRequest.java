package com.dapasta.notpong.packets.client;

import com.dapasta.notpong.packets.Packet;

public class MovementRequest extends Packet {
    public int id;

    public String sessionId;
    public int playerId;

    public float x;

}
