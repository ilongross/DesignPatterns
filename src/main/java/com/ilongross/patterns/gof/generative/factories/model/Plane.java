package com.ilongross.patterns.gof.generative.factories.model;

public class Plane extends Vehicle{


    public Plane() {
        model = "Sport Cruizer";
    }

    @Override
    public void move() {
        System.out.println("Fly like a plane");
    }
}
