package com.samar.model;

import com.samar.interfaces.IceCream;

public class PecanIceCream extends IceCreamDecorator{
    public PecanIceCream(IceCream iceCream) {
        super(iceCream);
    }
}
