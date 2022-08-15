package com.samar;

import com.samar.model.*;

public class Main {

    public static void main(String[] args) {

        // Creating our Receivers
        MarioCharacterReceiver mario  =new MarioCharacterReceiver();
        mario.setName("Mario");

        KirbyCharacterReceiver kirby = new KirbyCharacterReceiver();
        kirby.setName("Kirby");

        // Creating our Commands
        MarioUpCommand marioUpCommand  = new MarioUpCommand(mario);
        MarioDownCommand marioDownCommand  =new MarioDownCommand(mario);
        MarioLeftCommand marioLeftCommand  =new MarioLeftCommand(mario);
        MarioRightCommand marioRightCommand  =new MarioRightCommand(mario);


        KirbyUpCommand kirbyUpCommand  =new KirbyUpCommand(kirby);
        KirbyDownCommand kirbyDownCommand  =new KirbyDownCommand(kirby);



        //Invoker
        GameBoy gameBoy = new GameBoy(marioUpCommand, marioDownCommand, marioLeftCommand, marioRightCommand);

        gameBoy.arrowDown();
        gameBoy.arrowLeft();
        gameBoy.arrowRight();

        GameBoy gameBoy1  =new GameBoy(kirbyUpCommand, kirbyDownCommand);
        gameBoy1.arrowDown();
        gameBoy1.arrowUp();

    }
}
