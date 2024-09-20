package com.sag.a01spfwgame.game.tightcoupling;

public class GameRunner {
	
	MarioGame game;
	
	public GameRunner(MarioGame game) {
		this.game  = game;
	}

	public void run() {
		System.out.println("run() method called");
		game.up();
		game.down();
	}
	
	

}
