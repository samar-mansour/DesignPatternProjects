package com.samar.model;

import com.samar.interfaces.Command;

public class MarioRightCommand implements Command {
    private MarioCharacterReceiver marioCharacter;

    public MarioRightCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }


    @Override
    public void execute() {
        marioCharacter.moveRight();
    }
}
