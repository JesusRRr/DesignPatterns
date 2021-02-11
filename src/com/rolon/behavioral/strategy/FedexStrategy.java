package com.rolon.behavioral.strategy;

public class FedexStrategy implements ShipmentStrategy{
    @Override
    public float calculateTaxes() {
        return 2.41f;
    }
}
