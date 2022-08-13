package com.samar.model;

public class JamaicanVeggieBurger extends Hamburger {

    public JamaicanVeggieBurger() {
        name = "Jamaican Style Veggie Burger";
        sauce = "Spicy Jamaican sauce";
        buns = "Lettuce wrap!";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Jamaican style...");
    }
}
