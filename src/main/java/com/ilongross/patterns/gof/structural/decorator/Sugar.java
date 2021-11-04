package com.ilongross.patterns.gof.structural.decorator;

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
