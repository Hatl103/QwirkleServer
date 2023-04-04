package com.example.qwirkle.server;

import com.example.qwirkle.Client;
import com.example.qwirkle.GameAction;
import com.example.qwirkle.GameInfo;


/**
 * Message sent to all clients in a group when a new client joins
 * a group.
 */
public class Joined extends GameInfo {
    private static final long serialVersionUID = 102L;

    public String groupName;
    public String handle;

    public Joined(String groupName, String handle) {
        this.groupName = groupName;
        this.handle = handle;
    }

    @Override
    public String toString() {
        return String.format("Joined(%s, %s)", groupName, handle);
    }

}
