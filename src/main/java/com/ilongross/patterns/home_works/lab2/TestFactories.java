package com.ilongross.patterns.home_works.lab2;

import com.ilongross.patterns.home_works.lab2.currency_dao.CurrencyDao;
import com.ilongross.patterns.home_works.lab2.factory.Factory;
import com.ilongross.patterns.home_works.lab2.item_dao.ItemDao;

public class TestFactories {

    public static Factory objDBFactory = new FactoryProducer().createFactory("obj");
    public static Factory sqlDBFactory = new FactoryProducer().createFactory("sql");
    public static Factory xmlDBFactory = new FactoryProducer().createFactory("xml");

    public static void main(String[] args) {

        CurrencyDao objCurrency = objDBFactory.createCurrencyDao();
        CurrencyDao sqlCurrency = sqlDBFactory.createCurrencyDao();
        CurrencyDao xmlCurrency = xmlDBFactory.createCurrencyDao();

        ItemDao objItem = objDBFactory.createItemDao();
        ItemDao sqlItem = sqlDBFactory.createItemDao();
        ItemDao xmlItem = xmlDBFactory.createItemDao();

        System.out.println(objCurrency.getClass().getSimpleName());
        System.out.println(sqlCurrency.getClass().getSimpleName());
        System.out.println(xmlCurrency.getClass().getSimpleName());

        System.out.println(objItem.getClass().getSimpleName());
        System.out.println(sqlItem.getClass().getSimpleName());
        System.out.println(xmlItem.getClass().getSimpleName());

    }
}
