package com.samar;

public abstract class Game {
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();


    //Template method
    /*
     we don't want our subclasses to be able to override
     this method and change the recipe.
     Because that would destroy the entire
     relationship that we're trying to establish here.
    */
    public final void play(){
        loadAssets();
        initialize();
        startPlay();
        if (addNewGameCharacter()){
            addNewGameCharacterToTheGame();
        }
        endPlay();
    }

    //Hooked on Template Method
    protected abstract void addNewGameCharacterToTheGame();

    void loadAssets(){
        System.out.println("Loading Game Assets!");
    }

    boolean addNewGameCharacter(){
        return true;
    }
}
