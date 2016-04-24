package com.dapasta.notpong.packets.server;

import com.dapasta.notpong.packets.Packet;

import java.util.Map;

public class JoinGameResponse extends Packet {
    public String sessionId;
    public String gameName;
    public String creatorName;
    public Map<Integer, String> players;
}
