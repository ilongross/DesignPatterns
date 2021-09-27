package com.ilongross.patterns.generative.home_work.ex2_abstract_factory.factory;

import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.item_dao.ItemDao;
import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.currency_dao.CurrencyDao;

public interface Factory {
    String getName();
    ItemDao createItemDao();
    CurrencyDao createCurrencyDao();
}
