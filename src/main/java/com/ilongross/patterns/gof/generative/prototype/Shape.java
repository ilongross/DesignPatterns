package com.ilongross.patterns.gof.generative.prototype;

public abstract class Shape implements Cloneable {

    private String color;
    private int coordX;
    private int coordY;
    private Author author;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        var newShape = (Shape)super.clone();
        newShape.setColor(this.color);
        newShape.setCoordX(this.coordX);
        newShape.setCoordY(this.coordY);
        newShape.setAuthor(this.author.clone());
        return newShape;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCoordX() {
        return coordX;
    }
    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }
    public int getCoordY() {
        return coordY;
    }
    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }
}
