package com.samar.model;

import com.samar.controller.Payment;

public class PaypalAlgorithm implements Payment {
    private String email;
    private String password;

    public PaypalAlgorithm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Paypal");
    }
}
