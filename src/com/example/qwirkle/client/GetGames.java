package com.example.qwirkle.client;

import com.example.qwirkle.Client;
import com.example.qwirkle.GameAction;


public class GetGames extends GameAction {
    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public GetGames(Client player) {
        super(player);
    }

    @Override
    public void start(Client[] players) {

    }

    @Override
    public void sendAction(GameAction action) {

    }
}
