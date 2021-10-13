package com.ilongross.patterns.home_works.lab2.factory;

import com.ilongross.patterns.home_works.lab2.item_dao.ItemDao;
import com.ilongross.patterns.home_works.lab2.currency_dao.CurrencyDao;

public interface Factory {
    String getName();
    ItemDao createItemDao();
    CurrencyDao createCurrencyDao();
}
