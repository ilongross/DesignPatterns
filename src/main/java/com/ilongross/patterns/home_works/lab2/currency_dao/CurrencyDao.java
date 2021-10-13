package com.ilongross.patterns.home_works.lab2.currency_dao;

import com.ilongross.patterns.home_works.lab2.Id;

import java.util.Currency;

public interface CurrencyDao {
    void create(Currency currency);
    Currency read(Id id);
    void update(Currency currency);
    void delete(Currency currency);
}
