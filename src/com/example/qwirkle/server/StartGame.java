package com.example.qwirkle.server;

import com.example.qwirkle.GameInfo;

public class StartGame extends GameInfo {
    private static final long serialVersionUID = -6033593763935388391L;

    // an array, in order of the names of all the players playing the game
    private String[] allPlayerNames;

    /**
     * constructor
     *
     * @param allPlayerNames
     * 		an array containing the names of all the players that are playing
     * 		the game, in player-ID order.
     */
    public StartGame(String[] allPlayerNames) {
        this.allPlayerNames = allPlayerNames;
    }

    /**
     * getter-method for the array of player names
     *
     * @return
     * 		the array of player names
     */
    public String[] getPlayerNames() {
        return allPlayerNames;
    }
}
