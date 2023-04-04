package com.example.qwirkle.client;

import com.example.qwirkle.Client;
import com.example.qwirkle.GameAction;
import com.example.qwirkle.Tile;


import java.util.ArrayList;
import java.util.List;

public class SwapTile extends GameAction {
    private static final long serialVersionUID = 5738184719485729852L;

    // Indices to swap.
    private List<Integer> swapIdx;

    /**
     * Constructor: SwapTileAction
     * @param player The player.
     * @param myPlayerHand The player hand.
     */
    public SwapTile(Client player, List<Tile>  myPlayerHand) {
        // Invoke superclass constructor to set the player
        super(player);

        // Initialize the swap indices
        this.swapIdx = new ArrayList<>();
        int i=-1;
        for (Tile tile:myPlayerHand){
            i++;
            if (tile == null) continue;
            if (tile.isSelected()) {
                swapIdx.add(i);
            }

        }
    }

    /**
     * Method: getSwapIdx
     * Gets the array of indices for the tiles to swap.
     *
     * @return array that has indices to swap
     */
    public List<Integer> getSwapIdx() {
        return swapIdx;
    }

    @Override
    public void start(Client[] players) {

    }

    @Override
    public void sendAction(GameAction action) {

    }
}
