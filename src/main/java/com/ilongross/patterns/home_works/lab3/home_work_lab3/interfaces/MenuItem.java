package com.ilongross.patterns.home_works.lab3.home_work_lab3.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuItem implements Product{

    protected List<Product> productList = new ArrayList<>();

    @Override
    public int countCalories() {
        int count = 0;
        for (Product p : productList) {
            count += p.countCalories();
        }
        return count;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " (" + countCalories() + " calories)";
    }

}
