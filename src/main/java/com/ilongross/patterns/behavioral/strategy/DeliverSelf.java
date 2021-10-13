package com.ilongross.patterns.behavioral.strategy;

public class DeliverSelf implements DeliveryStrategy{
    @Override
    public void delivery(String product, String owner) {
        System.out.println("Product " + product + " take by owner self " + owner);
    }
}
