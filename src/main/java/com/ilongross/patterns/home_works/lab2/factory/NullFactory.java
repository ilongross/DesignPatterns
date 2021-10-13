package com.ilongross.patterns.home_works.lab2.factory;

import com.ilongross.patterns.home_works.lab2.currency_dao.CurrencyDao;
import com.ilongross.patterns.home_works.lab2.item_dao.ItemDao;

public class NullFactory implements Factory{

    private String name;

    public NullFactory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public ItemDao createItemDao() {
        return null;
    }

    @Override
    public CurrencyDao createCurrencyDao() {
        return null;
    }
}
