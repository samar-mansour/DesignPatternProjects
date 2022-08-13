package com.samar.interfaces;

import com.samar.model.Hamburger;

public abstract class HamburgerStore {

    // no need for those
    /*private SimpleHamburgerFactory factory;

    public HamburgerStore(SimpleHamburgerFactory factory) {
        this.factory = factory;
    }*/

    public Hamburger orderHamburger(String type){
        Hamburger burger;

        // We now use our factory! Not the if statements that we use for Simple factory
        burger = createHamburger(type); // factory.createHamburger(type);

        burger.prepare();
        burger.cook();
        burger.box();

        return burger;
    }

    abstract public Hamburger createHamburger(String type);
}
