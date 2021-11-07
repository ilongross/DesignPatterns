package com.ilongross.patterns.home_works.lab3.home_work_lab3.menu_items;

import com.ilongross.patterns.home_works.lab3.home_work_lab3.interfaces.MenuItem;
import com.ilongross.patterns.home_works.lab3.home_work_lab3.interfaces.Product;

import java.util.ArrayList;
import java.util.List;

public class Tiramisu extends MenuItem {

    private List<Product> compound = new ArrayList<>();

    public Tiramisu(Product ... products) {
        this.compound.addAll(List.of(products));
    }

    @Override
    public int countCalories() {
        return super.countCalories() + totalCalories();
    }

    private int totalCalories() {
        int count = 0;
        for (Product p : compound) {
            count += p.countCalories();
        }
        return count;
    }

}
