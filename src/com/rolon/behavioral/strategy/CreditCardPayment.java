package com.rolon.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(String product) {
        System.out.println("Credit card payment selected for " + product);
    }
}
