package com.ilongross.patterns.behavioral.mediator;

public class MainScore extends Score{

    public MainScore(float sum, String number, String owner) {
        super(sum, number, owner);
    }

    @Override
    public void depositMoney(float money) {
        sum += money;
    }

    @Override
    public void withdrawMoney(float money) {
        sum -= money;
    }
}
