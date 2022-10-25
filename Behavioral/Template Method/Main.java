package com.samar;

import com.samar.model.EndlessRunnerGame;
import com.samar.model.FootballGame;

public class Main {

    public static void main(String[] args) {
        Game game  = new FootballGame();
        game.play();

        System.out.println("=======");

        game = new EndlessRunnerGame();
        game.play();
    }
}
