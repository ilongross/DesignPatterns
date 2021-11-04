package com.ilongross.patterns.gof.generative.prototype;

public class DemoPrototype {
    public static void main(String[] args) {
        var circle = new Circle();
        circle.setRadius(100);
        circle.setColor("green");
        circle.setCoordX(10);
        circle.setCoordY(5);

        var author = new Author("Ilon");
        circle.setAuthor(author);


        try {
            Circle circle2 = circle.clone();
            System.out.println(circle2);

            circle.setRadius(200);

            System.out.println(circle2);

            circle.getAuthor().setName("Nasty");
            System.out.println(circle2.getAuthor());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
