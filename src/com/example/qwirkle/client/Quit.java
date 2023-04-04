package com.example.qwirkle.client;

import com.example.qwirkle.Client;
import com.example.qwirkle.GameAction;



public class Quit extends GameAction {
    private static final long serialVersionUID = 4L;

    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public Quit(Client player) {
        super(player);
    }

    @Override
    public String toString() {
        return "Quit()";
    }

    @Override
    public void start(Client[] players) {

    }

    @Override
    public void sendAction(GameAction action) {

    }
}
