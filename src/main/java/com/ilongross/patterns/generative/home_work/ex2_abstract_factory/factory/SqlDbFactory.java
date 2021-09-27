package com.ilongross.patterns.generative.home_work.ex2_abstract_factory.factory;

import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.currency_dao.SqlDbCurrencydaoImpl;
import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.item_dao.ItemDao;
import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.currency_dao.CurrencyDao;
import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.item_dao.SqlDbItemDaoImpl;

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
