package com.rolon.structural.decorator;

public class Main {
    public static  void main(String[] args){
        System.out.println("Decorator");
        Drink d1 = new CappuccinoChocolate(new Cappuccino());
        Drink d2 = new CappuccinoChai(new Cappuccino());
        System.out.println(d1.make());
        System.out.println(d2.make());
    }
}
