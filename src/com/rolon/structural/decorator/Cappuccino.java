package com.rolon.structural.decorator;

public class Cappuccino implements Drink {
    @Override
    public String make() {
        String message = "Making a Cappuccino";
        return message;
    }
}
