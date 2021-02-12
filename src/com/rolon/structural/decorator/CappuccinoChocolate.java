package com.rolon.structural.decorator;

import java.io.PrintStream;

public class CappuccinoChocolate extends CappuccinoDecorator{
    @Override
    public String decorate() {
        return " and adding chocolate";
    }

    public CappuccinoChocolate(Cappuccino cappuccino){
        super(cappuccino);
    }

    @Override
    public String make() {
        return super.make() + decorate();
    }
}
