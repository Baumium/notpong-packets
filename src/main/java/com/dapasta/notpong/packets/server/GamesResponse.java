package com.dapasta.notpong.packets.server;

import com.dapasta.notpong.packets.Packet;

import java.util.List;

public class GamesResponse extends Packet {
    public List<Game> games;
}
