package com.example.qwirkle;


import java.io.Serializable;

public abstract class GameAction implements Serializable, Game {
    private static final long serialVersionUID = 30672013L;

    // the player who generated the request
    private Client player;

    /**
     * constructor for GameAction
     *
     * @param player
     * 		the player who created the action
     */
    public GameAction(Client player) {
        this.player = player;
    }

    /**
     * tells the player who created the action
     *
     * @return the player who created the action
     *
     */
    public Client getPlayer() {
        return player;
    }

    /** Resets the source of the action. The intent is that it be used only
     *  by ProxyGame and ProxyPlayer.
     *
     * @param p
     * 		the new player to which the action is to be associated
     */
    public void setPlayer(Client p) {
        this.player = p;
    }
}
