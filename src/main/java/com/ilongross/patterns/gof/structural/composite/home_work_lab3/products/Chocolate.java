package com.ilongross.patterns.gof.structural.composite.home_work_lab3.products;

import com.ilongross.patterns.gof.structural.composite.home_work_lab3.interfaces.Product;

public class Chocolate implements Product {

    private int calories;

    public Chocolate(int calories) {
        this.calories = calories;
    }

    @Override
    public int countCalories() {
        return calories;
    }
}
