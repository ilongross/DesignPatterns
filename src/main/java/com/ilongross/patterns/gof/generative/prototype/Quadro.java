package com.ilongross.patterns.gof.generative.prototype;

public class Quadro extends Shape {

    private int numberOfAngles;

    @Override
    protected Quadro clone() throws CloneNotSupportedException {
        var newQuadro = (Quadro)super.clone();
        newQuadro.setNumberOfAngles(this.numberOfAngles);
        return newQuadro;
    }

    public int getNumberOfAngles() {
        return numberOfAngles;
    }
    public void setNumberOfAngles(int numberOfAngles) {
        this.numberOfAngles = numberOfAngles;
    }

    @Override
    public String toString() {
        return "Quadro{" +
                "numberOfAngles=" + numberOfAngles +
                '}';
    }
}
