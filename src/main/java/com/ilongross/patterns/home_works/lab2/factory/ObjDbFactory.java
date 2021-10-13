package com.ilongross.patterns.home_works.lab2.factory;

import com.ilongross.patterns.home_works.lab2.currency_dao.ObjDbCurrencyDaoImpl;
import com.ilongross.patterns.home_works.lab2.item_dao.ItemDao;
import com.ilongross.patterns.home_works.lab2.currency_dao.CurrencyDao;
import com.ilongross.patterns.home_works.lab2.item_dao.ObjDbItemDaoImpl;

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
