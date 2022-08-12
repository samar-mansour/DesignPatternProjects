package com.samar.model;

import com.samar.interfaces.IceCream;

public class VanillaIceCream extends IceCreamDecorator{
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Vanilla Ice-Cream");
        return 1.0 + super.cost();
    }
}
