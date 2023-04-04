package com.example.qwirkle.client;

import com.example.qwirkle.Client;
import com.example.qwirkle.GameAction;
import com.example.qwirkle.Games;


/**
 * The message received when a client wishes to join a different
 * chat group.
 */
public class Join extends GameAction {
    private static final long serialVersionUID = 1L;
    public String groupName;

    public Join(String groupName, Client client) {
        super(client);
        this.groupName = groupName;
        Games.join(groupName,client);
    }

    @Override
    public String toString() {
        return String.format("Join('%s')", groupName);
    }

    @Override
    public void start(Client[] players) {

    }

    @Override
    public void sendAction(GameAction action) {

    }
}
