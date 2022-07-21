package com.samar.controller;

import com.samar.controller.ScoreboardBase;

public class Scoreboard{
    public ScoreboardBase scoreBase;

    public void showScore(int taps, int multiplier){
        System.out.println(scoreBase.calculateScore(taps, multiplier));
    }
}
