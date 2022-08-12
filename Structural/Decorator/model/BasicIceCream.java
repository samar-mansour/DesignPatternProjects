package com.samar.model;

import com.samar.interfaces.IceCream;

public class BasicIceCream implements IceCream {

    private IceCream basicIceCream;

    public BasicIceCream() {
        System.out.println("Creating a basic Ice-Cream flavor!");
    }

    @Override
    public double cost() {
        return 0.50;
    }
}
