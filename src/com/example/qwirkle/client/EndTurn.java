package com.example.qwirkle.client;

import com.example.qwirkle.Client;
import com.example.qwirkle.GameAction;


import java.io.Serializable;

public class EndTurn extends GameAction implements Serializable {

    private static final long serialVersionUID = -12895887461789L;/**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public EndTurn(Client player) {
        super(player);
    }

    @Override
    public void start(Client[] players) {

    }

    @Override
    public void sendAction(GameAction action) {

    }
}
