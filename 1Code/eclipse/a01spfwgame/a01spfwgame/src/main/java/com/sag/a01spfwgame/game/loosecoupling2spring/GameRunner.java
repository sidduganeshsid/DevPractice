package com.sag.a01spfwgame.game.loosecoupling2spring;

public class GameRunner {
	
	GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game  = game;
	}

	public void run() {
		System.out.println("run() method called");
		game.up();
		game.down();
	}
	
	

}
