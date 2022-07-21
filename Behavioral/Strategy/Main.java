package com.samar;

import com.samar.controller.Scoreboard;
import com.samar.model.Balloon;
import com.samar.model.Clown;

public class Main {

    public static void main(String[] args) {
        Scoreboard scoreBoard = new Scoreboard();

        System.out.print("Balloon Tap Score:");
        scoreBoard.scoreBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.print("Clown Tap score: ");
        scoreBoard.scoreBase = new Clown();
        scoreBoard.showScore(10, 5);
    }
}
