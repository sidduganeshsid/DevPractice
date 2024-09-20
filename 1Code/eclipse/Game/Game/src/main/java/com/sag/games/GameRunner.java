package com.sag.games;

public class GameRunner {
	
	MarioGame game;
	
	public GameRunner(MarioGame game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running Game is :: "+game);
		game.up();
		game.down();
		game.right();
		game.left();
	}

}
