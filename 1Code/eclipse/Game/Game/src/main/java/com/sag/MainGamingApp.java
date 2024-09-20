package com.sag;

import com.sag.games.GameRunner;
import com.sag.games.MarioGame;

public class MainGamingApp {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
