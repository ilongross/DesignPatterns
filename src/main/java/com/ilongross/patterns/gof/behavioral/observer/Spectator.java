package com.ilongross.patterns.gof.behavioral.observer;

public class Spectator implements Subscriber{

    private String name;

    public Spectator(String name) {
        this.name = name;
    }

    @Override
    public void update(String data) {
        System.out.println(name + " is watching " + data);
    }
}
