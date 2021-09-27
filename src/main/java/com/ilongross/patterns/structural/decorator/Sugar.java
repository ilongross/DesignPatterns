package com.ilongross.patterns.structural.decorator;

public class Sugar extends Component{
    public Sugar(CoffeeComponent innerComponent) {
        super(innerComponent);
    }

    @Override
    public void printComponentInfo() {
        super.printComponentInfo();
        System.out.println("Sugar inside");
    }

    @Override
    public void enrichComponent(CoffeeCup cup) {

    }
}
