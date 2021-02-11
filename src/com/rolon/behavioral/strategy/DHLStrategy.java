package com.rolon.behavioral.strategy;

public class DHLStrategy implements ShipmentStrategy{
    @Override
    public float calculateTaxes() {
        return 2.58f;
    }
}
