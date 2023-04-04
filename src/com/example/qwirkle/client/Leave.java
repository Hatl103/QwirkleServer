package com.example.qwirkle.client;

import com.example.qwirkle.Client;
import com.example.qwirkle.GameAction;
import com.example.qwirkle.Games;

/**
 * The message received when a client wishes to leave the
 * current chat group that they are in.
 */
public class Leave extends GameAction {
    private static final long serialVersionUID = 2L;

    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public Leave(Client player) {
        super(player);
        Games.leave(player);
    }

    @Override
    public String toString() {
        return "Leave()";
    }

    @Override
    public void start(Client[] players) {

    }

    @Override
    public void sendAction(GameAction action) {

    }
}
