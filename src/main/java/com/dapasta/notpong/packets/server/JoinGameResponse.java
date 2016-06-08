package com.dapasta.notpong.packets.server;

import java.util.Map;

public class JoinGameResponse extends GameInfoPacket {
    public Map<Integer, String> players;
}
