package com.rolon.structural.decorator;

public class Cappuccino implements Coffee{
    @Override
    public String make() {
        String message = "Making a Cappuccino";
        return message;
    }
}
