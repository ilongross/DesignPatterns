package com.ilongross.patterns.home_works.lab2.factory;

import com.ilongross.patterns.home_works.lab2.currency_dao.SqlDbCurrencydaoImpl;
import com.ilongross.patterns.home_works.lab2.item_dao.ItemDao;
import com.ilongross.patterns.home_works.lab2.currency_dao.CurrencyDao;
import com.ilongross.patterns.home_works.lab2.item_dao.SqlDbItemDaoImpl;

public class SqlDbFactory implements Factory{

    private String name;

    public SqlDbFactory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ItemDao createItemDao() {
        return new SqlDbItemDaoImpl();
    }

    @Override
    public CurrencyDao createCurrencyDao() {
        return new SqlDbCurrencydaoImpl();
    }
}
