package com.rolon.behavioral.strategy;

public class DebitCardPayment implements PaymentStrategy{
    @Override
    public void pay(String product) {
        System.out.println("Debit card payment selected for "+ product);
    }
}
