package com.rolon.behavioral.strategy;

public class Purchase {
    private String product;
    private PaymentStrategy payment;
    private ShipmentStrategy shipment;

    Purchase(String product){
        this.product=product;
    }

    public void setPayment(PaymentStrategy payment) {
        this.payment = payment;
    }

    public void setShipment(ShipmentStrategy shipment) {
        this.shipment = shipment;
    }

    public void getFinalPrice(){
        String message = new StringBuilder()
                .append("The total cost is: ")
                .append(product)
                .append(" cost")
                .append("+")
                .append( this.shipment.calculateTaxes())
                .toString();
        System.out.println(message);
    }

    public void pay(){
        payment.pay(product);
    }
}
