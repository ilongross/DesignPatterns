package com.ilongross.patterns.gof.structural.flyweight;

public class Purchase {
    private final String owner;
    private final float cost;
    private final Product product;

    public Purchase(String owner, float cost, Product product) {
        this.owner = owner;
        this.cost = cost;
        this.product = product;
    }

    public String getOwner() {
        return owner;
    }

    public float getCost() {
        return cost;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "owner='" + owner + '\'' +
                ", cost=" + cost +
                ", product=" + product +
                '}';
    }
}
