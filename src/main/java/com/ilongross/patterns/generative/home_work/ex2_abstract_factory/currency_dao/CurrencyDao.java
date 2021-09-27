package com.ilongross.patterns.generative.home_work.ex2_abstract_factory.currency_dao;

import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.Id;

import java.util.Currency;

public interface CurrencyDao {
    void create(Currency currency);
    Currency read(Id id);
    void update(Currency currency);
    void delete(Currency currency);
}
