package com.samar.model;

import com.samar.interfaces.Command;

public class GameBoy {
    private Command UpCommand, DownCommand, LeftCommand, RightCommand;

    public GameBoy(Command upCommand, Command downCommand,
                   Command leftCommand, Command rightCommand) {
        UpCommand = upCommand;
        DownCommand = downCommand;
        LeftCommand = leftCommand;
        RightCommand = rightCommand;
    }

    public GameBoy(Command upCommand, Command downCommand) {
        UpCommand = upCommand;
        DownCommand = downCommand;
    }

    public void arrowUp(){
        UpCommand.execute();
    }

    public void arrowDown(){
        DownCommand.execute();
    }

    public void arrowRight(){
        RightCommand.execute();
    }

    public void arrowLeft(){
        LeftCommand.execute();
    }
}
