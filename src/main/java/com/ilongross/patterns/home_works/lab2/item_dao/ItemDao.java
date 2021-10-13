package com.ilongross.patterns.home_works.lab2.item_dao;

import com.ilongross.patterns.home_works.lab2.Item;
import com.ilongross.patterns.home_works.lab2.Id;

public interface ItemDao {
    void crete(Item item);
    Item read(Id id);
    void update(Item item);
    void delete(Item item);
}
