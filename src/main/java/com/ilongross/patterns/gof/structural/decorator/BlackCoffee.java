package com.ilongross.patterns.gof.structural.decorator;

public class BlackCoffee implements CoffeeComponent{


    @Override
    public void printComponentInfo() {
        System.out.println("Black coffee");
    }

    @Override
    public void enrichComponent(CoffeeCup cup) {
    }


}
