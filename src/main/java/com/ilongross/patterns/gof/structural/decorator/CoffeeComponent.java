package com.ilongross.patterns.gof.structural.decorator;

public interface CoffeeComponent {
    void printComponentInfo();
    void enrichComponent(CoffeeCup cup);
}
