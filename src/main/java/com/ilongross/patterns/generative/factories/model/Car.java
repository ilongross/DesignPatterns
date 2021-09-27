package com.ilongross.patterns.generative.factories.model;

public class Car extends Vehicle{

    public Car() {
        model = "A8";
    }

    @Override
    public void move() {
        System.out.println("Move like a car");
    }
}
