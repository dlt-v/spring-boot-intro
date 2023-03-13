package com.michalski.learnspring;

import com.michalski.learnspring.game.GameRunner;
import com.michalski.learnspring.game.PacmanGame;

public class App01AppGamingBasic {
    public static void main(String[] args) {
        //var game = new MarioGame();
//        var game = new ContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
