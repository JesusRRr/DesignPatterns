package com.rolon.behavioral.strategy;

public class Main {
    public static  void main(String[] args){
        System.out.println("Strategy Design Pattern");
        Purchase p1 = new Purchase("Boots");
        Purchase p2 = new Purchase("Pants");

        p1.setShipment(new FedexStrategy());
        p1.setPayment(new CreditCardPayment());
        p2.setShipment(new DHLStrategy());
        p2.setPayment(new DebitCardPayment());

        p1.getFinalPrice();
        p2.getFinalPrice();

        p1.pay();
        p2.pay();

    }
}
