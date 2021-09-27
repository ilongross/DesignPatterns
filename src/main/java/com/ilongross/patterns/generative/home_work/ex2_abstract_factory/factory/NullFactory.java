package com.ilongross.patterns.generative.home_work.ex2_abstract_factory.factory;

import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.currency_dao.CurrencyDao;
import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.item_dao.ItemDao;

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
