package com.ilongross.patterns.gof.generative.factories.model;

public class Ship extends Vehicle{

    private String model;
    private String name;
    private int decks;
    private int length;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDecks() {
        return decks;
    }

    public void setDecks(int decks) {
        this.decks = decks;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Ship() {
        model = "Titanik";
    }

    @Override
    public void move() {
        System.out.println("Walk like a ship");
    }

    @Override
    public String toString() {
        return "Ship{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", decks=" + decks +
                ", length=" + length +
                '}';
    }
}
