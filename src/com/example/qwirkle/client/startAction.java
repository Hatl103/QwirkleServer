package com.example.qwirkle.client;


import com.example.qwirkle.Client;
import com.example.qwirkle.GameAction;

public class startAction extends GameAction {
	
	// to satisfy the Serializable interface
	private static final long serialVersionUID = -5286032209480788772L;

	/** constructor
	 * 
	 * @param p
	 * 		the player who sent the action
	 */
	public startAction(Client p) {
		super(p);
	}

	@Override
	public void start(Client[] players) {

	}

	@Override
	public void sendAction(GameAction action) {

	}
}
