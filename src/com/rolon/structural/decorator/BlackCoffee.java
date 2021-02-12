package com.rolon.structural.decorator;

public class BlackCoffee implements Drink {
    @Override
    public String make() {
        String message="Making a Black Coffee";
        return message;
    }
}
