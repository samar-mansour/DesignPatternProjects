package com.samar.model;

import com.samar.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class EndlessRunnerGame extends Game {

    @Override
    public void initialize() {
        System.out.println("Endless Runner initializing...");
    }

    @Override
    public void startPlay() {
        System.out.println("Endless Runner Starting....");
        playerWantsNewCharacter();
    }

    @Override
    public void endPlay() {
        System.out.println("Endless Runner Ending....");
    }

    @Override
    protected void addNewGameCharacterToTheGame() {
        boolean answer = playerWantsNewCharacter();
        if (answer == true)
            System.out.println("Adding new Character to the Game");
        System.out.println("Not Adding new Character to the Game!");
    }

    public boolean playerWantsNewCharacter(){
        String answer = getUerInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }

    private String getUerInput() {
        String answer = null;
        System.out.println("Would you like to add a new character to the game? (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO Error");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }

    //Add more methods...

}
