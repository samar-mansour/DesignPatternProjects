package com.samar.model;

import com.samar.controller.ScoreboardBase;

public class Clown extends ScoreboardBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 10;
    }

}
