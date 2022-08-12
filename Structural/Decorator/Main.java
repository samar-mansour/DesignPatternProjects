package com.samar;

import com.samar.interfaces.IceCream;
import com.samar.model.BasicIceCream;
import com.samar.model.MintIceCream;
import com.samar.model.VanillaIceCream;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-cream cost $" + basicIceCream.cost());

        //Add Vanilla to the order
        IceCream vanilla = new VanillaIceCream(basicIceCream); //wrapping ice-cream with vanilla
        System.out.println("Adding Vanilla - cost is: $" + vanilla.cost());

        //Adding Mint
        IceCream mint = new MintIceCream(vanilla);
        System.out.println("Adding mint - cost is: $" + mint.cost());

    }
}
