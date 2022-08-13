package com.samar.model;

import com.samar.interfaces.HamburgerStore;

public class JamHamBurgerstore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if(type.equals("cheese")){
            return new JamaicanCheeseBurger();
        } else if (type.equals("Veggie")){
            return new JamaicanVeggieBurger();
        }else return null;
    }
}
