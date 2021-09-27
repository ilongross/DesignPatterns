package com.ilongross.patterns.structural.decorator;

public interface CoffeeComponent {
    void printComponentInfo();
    void enrichComponent(CoffeeCup cup);
}
