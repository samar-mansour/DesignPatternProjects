package com.samar.model;

import com.samar.interfaces.IceCream;

public class MintIceCream extends IceCreamDecorator{
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Mint Ice-Cream");
        return 1.5 + super.cost();
    }
}
