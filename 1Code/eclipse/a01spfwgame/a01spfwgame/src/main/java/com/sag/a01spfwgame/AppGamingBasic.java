package com.sag.a01spfwgame;

import com.sag.a01spfwgame.game.loosecoupling.GameRunner;
import com.sag.a01spfwgame.game.loosecoupling.MarioGame;
import com.sag.a01spfwgame.game.loosecoupling.SuperContraGame;

public class AppGamingBasic {
	
	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
	}

}
