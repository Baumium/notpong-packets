package com.dapasta.notpong.packets.server;

import com.dapasta.notpong.packets.Packet;

public class PlayerJoinBroadcast extends Packet {
    public int id;
    public String name;
}
