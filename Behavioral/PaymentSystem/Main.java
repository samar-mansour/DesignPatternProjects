package com.samar;

import com.samar.controller.ShoppingCart;
import com.samar.model.CreditCardAlgorithm;
import com.samar.model.PaypalAlgorithm;
import com.samar.model.Product;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirt = new Product("987", 50);
        Product hat = new Product("556", 40);

        cart.addProduct(pants);
        cart.addProduct(shirt);
        cart.addProduct(hat);

        //payment decisions
        cart.pay(new PaypalAlgorithm("example@gmail", "HelloWord"));

        cart.pay(new CreditCardAlgorithm("John", "256314789"));

    }
}
