package com.ilongross.patterns.gof.generative.factories.builder;

import com.ilongross.patterns.gof.generative.factories.model.Ship;
import com.ilongross.patterns.gof.generative.factories.model.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShipBuilder extends Vehicle {

    private String model;
    private String name;
    private int decks;
    private int length;

    private List<String> listErrors = new ArrayList<>();

    public ShipBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public ShipBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ShipBuilder setDecks(int decks) {
        if(decks < 1)
            listErrors.add("Количество палуб не может быть меньше 1");
        this.decks = decks;
        return this;
    }

    public ShipBuilder setLength(int length) {
        if(length < 10)
            listErrors.add("Длина корабля не может быть меньше 10 метров");
        this.length = length;
        return this;
    }

    public Ship build() throws Exception {
        if(listErrors.size() == 0) {
            var ship = new Ship();
            ship.setModel(this.model);
            ship.setName(this.name);
            ship.setDecks(this.decks);
            ship.setLength(this.length);
            return  ship;
        }
        else {
            throw new Exception(listErrors.stream().collect(Collectors.joining("; ", "(", ")")));
        }
    }

    @Override
    public void move() {

    }
}
