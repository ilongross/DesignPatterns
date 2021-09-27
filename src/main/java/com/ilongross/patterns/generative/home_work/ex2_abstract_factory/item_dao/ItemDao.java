package com.ilongross.patterns.generative.home_work.ex2_abstract_factory.item_dao;

import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.Item;
import com.ilongross.patterns.generative.home_work.ex2_abstract_factory.Id;

public interface ItemDao {
    void crete(Item item);
    Item read(Id id);
    void update(Item item);
    void delete(Item item);
}
