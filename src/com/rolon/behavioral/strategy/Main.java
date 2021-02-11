package com.rolon.behavioral.strategy;

public class Main {
    public static  void main(String[] args){
        System.out.println("Strategy Design Pattern");
        Purchase p1 = new Purchase("Boots");
        Purchase p2 = new Purchase("Pants");

        FedexStrategy fs = new FedexStrategy();
        DHLStrategy dhls = new DHLStrategy();



    }
}
