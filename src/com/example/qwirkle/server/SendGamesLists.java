package com.example.qwirkle.server;

import com.example.qwirkle.GameInfo;

import java.util.List;

public class SendGamesLists extends GameInfo {
    private static final long serialVersionUID = 101L;

    public List<String> gamesNames;

    @Override
    public String toString() {
        return String.format("GroupsListed(%s)", gamesNames.toString());
    }
}
