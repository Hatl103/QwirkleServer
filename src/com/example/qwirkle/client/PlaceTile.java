package com.example.qwirkle.client;

import com.example.qwirkle.Client;
import com.example.qwirkle.GameAction;


import java.io.Serializable;

public class PlaceTile extends GameAction implements Serializable{

        // For serialization.
        private static final long serialVersionUID = 3810381038472819384L;

        // Instance variables: tile position and player hands
        private int xPos;
        private int yPos;
        private int handIdx;

        /**
         * Constructor: PlaceTileAction
         *
         * @param player the player making the move
         * @param xPos the x-position of the spot on the board.
         * @param yPos the y-position of the spot on board
         * @param handIdx index of tile in hand
         */
        public PlaceTile(Client player, int xPos, int yPos, int handIdx) {
            // invoke superclass constructor to set the player
            super(player);

            // initialize instance variables
            this.xPos = xPos;
            this.yPos = yPos;
            this.handIdx = handIdx;
        }

        /**
         * Method: getXPos
         * Gets the x-position.
         *
         * @return x-position on board
         */
        public int getXPos() {
            return xPos;
        }

        /**
         * Method: getYPos
         * Gets the y-position
         *
         * @return y-position on board
         */
        public int getYPos() {
            return yPos;
        }

        /**
         * Method: getHandIdx
         * Gets the index of tile in hand
         *
         * @return index of tile in hand
         */
        public int getHandIdx() {
            return handIdx;
        }

    @Override
    public void start(Client[] players) {

    }

    @Override
    public void sendAction(GameAction action) {

    }
}
