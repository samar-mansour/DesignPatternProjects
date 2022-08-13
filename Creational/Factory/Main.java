package com.samar;

import com.samar.interfaces.HamburgerStore;
import com.samar.model.Hamburger;
import com.samar.model.JamHamBurgerstore;
import com.samar.model.MozHamburgerStore;

public class Main {

    public static void main(String[] args) {

        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();

        HamburgerStore jamaicanBurgerStore = new JamHamBurgerstore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered " + hamburger.getName() + "\n");

        hamburger = jamaicanBurgerStore.orderHamburger("Veggie");
        System.out.println("James ordered: " + hamburger.getName() + "\n");
    }
}
