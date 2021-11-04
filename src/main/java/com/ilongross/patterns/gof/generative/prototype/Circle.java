package com.ilongross.patterns.gof.generative.prototype;

public class Circle extends Shape {

    private int radius;

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        var newCircle = (Circle)super.clone();
        newCircle.setRadius(this.radius);
        return newCircle;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
