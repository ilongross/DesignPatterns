package com.ilongross.patterns.gof.behavioral.strategy;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class DeliveryByCourier implements DeliveryStrategy{

    private List<String> courierList = new LinkedList<>();

    public DeliveryByCourier() {
        for (int i = 0; i < 5; i++) {
            courierList.add("Courier_" + i);
        }
    }

    @Override
    public void delivery(String product, String owner) {
        var rand = new Random();
        System.out.println("Deliver " + product + " to " + owner + " using " + courierList.get(rand.nextInt(5)));
    }
}
