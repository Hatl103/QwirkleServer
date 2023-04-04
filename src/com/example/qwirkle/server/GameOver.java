package com.example.qwirkle.server;

import com.example.qwirkle.GameInfo;

public class GameOver extends GameInfo {
    private static final long serialVersionUID = -4466809058850530984L;

    // the message that gives the game's result
    private String message;

    /**
     * constructor
     *
     * @param msg
     * 		a message that tells the result of the game
     */
    public GameOver(String msg) {
        this.message = msg;
    }

    /**
     * getter method for the message
     *
     * @return
     * 		the message, telling the result of the game
     */
    public String getMessage() {
        return message;
    }
}
