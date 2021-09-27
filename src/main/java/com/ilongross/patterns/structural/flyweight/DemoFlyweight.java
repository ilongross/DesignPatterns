package com.ilongross.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoFlyweight {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            products.add(ProductFactory.createProduct("XXL", "red", "mokasiny"));
        }

        List<Purchase> purchases = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            purchases.add(new Purchase("Ilon", 1000f, products.get(0)));
        }

        purchases.forEach(p -> System.out.println(p));



    }
}
