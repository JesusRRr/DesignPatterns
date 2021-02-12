package com.rolon.structural.decorator;

public class BlackCoffee implements Coffee{
    @Override
    public void make() {
        String message="Making a Black Coffee";
        System.out.println(message);
    }
}
