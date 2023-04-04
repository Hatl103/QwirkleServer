package com.example.qwirkle.client;

import com.example.qwirkle.Client;
import com.example.qwirkle.GameAction;


/**
 * An action by which the player acknowledges that the game is over.
 *
 * @author Steven R. Vegdahl 
 * @version July 2013
 */
public class GameOverAction extends GameAction {

	// to satisfy the Serializable interface
	private static final long serialVersionUID = 4096230060363451102L;

	/**
	 * constructor
	 * 
	 * @param p
	 * 		the player to sent the action
	 */
	public GameOverAction(Client p) {
		super(p);
	}

	@Override
	public void start(Client[] players) {

	}

	@Override
	public void sendAction(GameAction action) {

	}
}
