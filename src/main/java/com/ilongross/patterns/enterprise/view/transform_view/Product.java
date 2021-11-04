package com.ilongross.patterns.enterprise.view.transform_view;

public class Product {

    private String name;
    private float cost;
    private int count;

    public Product(String name, float cost, int count) {
        this.name = name;
        this.cost = cost;
        this.count = count;
    }

    public String getName() {
        return  name;
    }
}
