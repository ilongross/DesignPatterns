package com.ilongross.patterns.generative.factories.model;

public class Plane extends Vehicle{


    public Plane() {
        model = "Sport Cruizer";
    }

    @Override
    public void move() {
        System.out.println("Fly like a plane");
    }
}
