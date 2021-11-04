package com.ilongross.patterns.gof.structural.decorator;

public class DemoDecorator {
    public static void main(String[] args) {
        var blackCoffee = new BlackCoffee();
        var component1 = new Sugar(blackCoffee);
        var component2 = new Milk(component1);
        var component3 = new Cinnamon(component2);

        component3.printComponentInfo();

    }
}
