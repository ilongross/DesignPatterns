package com.ilongross.patterns.home_works.lab2.factory;

import com.ilongross.patterns.home_works.lab2.currency_dao.XmlDbCurrencyDaoImpl;
import com.ilongross.patterns.home_works.lab2.item_dao.ItemDao;
import com.ilongross.patterns.home_works.lab2.currency_dao.CurrencyDao;
import com.ilongross.patterns.home_works.lab2.item_dao.XmlDbItemDaoImpl;

public class XmlDbFactory implements Factory{

    private String name;

    public XmlDbFactory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ItemDao createItemDao() {
        return new XmlDbItemDaoImpl();
    }

    @Override
    public CurrencyDao createCurrencyDao() {
        return new XmlDbCurrencyDaoImpl();
    }
}
