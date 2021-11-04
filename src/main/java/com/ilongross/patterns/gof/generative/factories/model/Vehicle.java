package com.ilongross.patterns.gof.generative.factories.model;

public abstract class Vehicle {

    private double power;

    public double getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public abstract void move();

    protected String model;

}
