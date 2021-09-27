package com.ilongross.patterns.structural.composite.home_work_lab3.products;

import com.ilongross.patterns.structural.composite.home_work_lab3.interfaces.Product;

public class Cheese implements Product {

    private int calories;

    public Cheese(int calories) {
        this.calories = calories;
    }

    @Override
    public int countCalories() {
        return calories;
    }
}
