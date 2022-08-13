package com.samar.model;

public class JamaicanCheeseBurger extends Hamburger {

    public JamaicanCheeseBurger() {
        name = "Jamaican Style Cheese Burger";
        sauce = "Spicy Jamaican sauce";
        buns = "Cooking dough buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Jamaican style...");
    }
}
