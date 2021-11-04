package com.ilongross.patterns.gof.structural.decorator;

public class Cinnamon extends Component{
    public Cinnamon(CoffeeComponent innerComponent) {
        super(innerComponent);
    }

    @Override
    public void printComponentInfo() {
        super.printComponentInfo();
        System.out.println("Cinnamon inside");
    }

    @Override
    public void enrichComponent(CoffeeCup cup) {

    }
}
