package com.ilongross.patterns.gof.structural.decorator;

public class Milk extends Component{
    public Milk(CoffeeComponent innerComponent) {
        super(innerComponent);
    }

    @Override
    public void printComponentInfo() {
        super.printComponentInfo();
        System.out.println("Milk inside");
    }

    @Override
    public void enrichComponent(CoffeeCup cup) {

    }
}
