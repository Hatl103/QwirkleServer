package com.example.qwirkle.client;

import com.example.qwirkle.Client;
import com.example.qwirkle.GameAction;


import java.io.Serializable;

public class NameAction extends GameAction implements Serializable {
	
	// to satisfy the Serializable interface
	private static final long serialVersionUID = -4128958866644574617L;
	
	// the player's name
	private String name;
	
	/** constructor
	 * 
	 * @param p
	 * 		the player who sent the action
	 * @param name
	 * 		the player's name
	 */
	public NameAction(Client p, String name) {
		super(p); // invoke superclass constructor
		this.name = name; // set the name
	}
	
	/**
	 * getter-method for the name
	 * 
	 * @return
	 * 		the player's name
	 */
	public String getName() {
		return name;
	}

	@Override
	public void start(Client[] players) {

	}

	@Override
	public void sendAction(GameAction action) {

	}
}
