package com.ilongross.patterns.gof.behavioral.strategy;

public class DeliveryByCar implements DeliveryStrategy{

    private String currentCarNumber = "AB 124 FD";

    @Override
    public void delivery(String product, String owner) {
        System.out.println("Deliver " + product + " to owner " + " look for car with number " + currentCarNumber);
    }
}
