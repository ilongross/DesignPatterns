package com.ilongross.patterns.structural.decorator;

public abstract class Component implements CoffeeComponent {

    private CoffeeComponent innerComponent;

    public Component(CoffeeComponent innerComponent) {
        this.innerComponent = innerComponent;
    }

    @Override
    public void printComponentInfo() {
        innerComponent.printComponentInfo();
    }
}
