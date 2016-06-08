package com.dapasta.notpong.packets.client;

import com.dapasta.notpong.packets.Packet;

public class CreateGameRequest extends Packet {

    // Creator info
    public String creatorName;

    // Game info
    public String gameName;
    public int gameSize;

    // Game specs
    public float fieldSize;
    public float ballRadius;
    public float ballSpeed;
    public float paddleWidth;
    public float paddleHeight;
}
