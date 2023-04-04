package com.example.qwirkle;


public interface Game {
    void start(Client[] players);
    void sendAction(GameAction action);
}
