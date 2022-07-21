package com.samar.model;

import com.samar.controller.ScoreboardBase;

public class Balloon extends ScoreboardBase {

    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}
