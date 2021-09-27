package com.ilongross.patterns.generative.home_work.ex2_abstract_factory.factory;

import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.currency_dao.ObjDbCurrencyDaoImpl;
import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.item_dao.ItemDao;
import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.currency_dao.CurrencyDao;
import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.item_dao.ObjDbItemDaoImpl;

public class ObjDbFactory implements Factory{

    private String name;

    public ObjDbFactory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ItemDao createItemDao() {
        return new ObjDbItemDaoImpl();
    }

    @Override
    public CurrencyDao createCurrencyDao() {
        return new ObjDbCurrencyDaoImpl();
    }
}
