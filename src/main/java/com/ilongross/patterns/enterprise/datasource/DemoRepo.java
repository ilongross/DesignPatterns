package com.ilongross.patterns.enterprise.datasource;

import java.util.ArrayList;
import java.util.UUID;

public class DemoRepo {
    public static void main(String[] args) {
        var product1 = new Product(UUID.randomUUID(), "Bread", 100.00F, 10, UUID.randomUUID());
        var product2 = new Product(UUID.randomUUID(), "Milk", 50.00F, 3, UUID.randomUUID());

        var products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);

        System.out.println(products);

    }
}
