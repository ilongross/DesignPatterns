package com.ilongross.patterns.behavioral.template_method;

public class DemoTemplate {
    public static void main(String[] args) {

        var rus = new RussianFlag();
        var gbr = new GermanFlag();

        rus.draw();
        System.out.println();
        gbr.draw();
    }
}
