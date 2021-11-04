package com.ilongross.patterns.gof.structural.decorator;

public class CoffeeCup {
    private String description = "Coffee cup of";

    public void appendDescription(String append) {
        description += append;
    }

    @Override
    public String toString() {
        return "CoffeeCup{" +
                "description='" + description + '\'' +
                '}';
    }
}
