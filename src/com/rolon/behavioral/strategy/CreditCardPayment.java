package com.rolon.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Credit card payment selected ");
    }
}
