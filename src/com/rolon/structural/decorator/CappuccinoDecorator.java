package com.rolon.structural.decorator;

public abstract class CappuccinoDecorator implements Drink{
    private Cappuccino cappuccino;

    public CappuccinoDecorator(Cappuccino cappuccino) {
        this.cappuccino=cappuccino;
    }

    public abstract String decorate();
    @Override
    public String make() {
        return cappuccino.make();
    }
}
