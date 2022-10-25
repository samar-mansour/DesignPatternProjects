package com.samar.model;

import com.samar.Game;

public class FootballGame extends Game {
    @Override
    public void initialize() {
        System.out.println("Football Game Initializing...");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Staring...");
    }

    @Override
    public void endPlay() {
        System.out.println("Football Game Ending...");
    }

    @Override
    protected void addNewGameCharacterToTheGame() {
        System.out.println("Adding new Character!");
    }
}
