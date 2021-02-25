package com.rolon.structural.decorator;

public class CappuccinoChai extends CappuccinoDecorator{
    public CappuccinoChai(Cappuccino cappuccino) {
        super(cappuccino);
    }
    @Override
    public String decorate() {
        return " Chai";
    }

    @Override
    public String make() {
        return super.make() + decorate();
    }
}
