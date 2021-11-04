package com.ilongross.patterns.gof.behavioral.mediator;

public class DepositScore extends Score{

    private float percent;

    public DepositScore(float sum, String number, String owner, float percent) {
        super(sum, number, owner);
        this.percent = percent;
    }

    @Override
    public void depositMoney(float money) {
        sum += money;
    }

    @Override
    public void withdrawMoney(float money) {
        sum -= money;
    }

    public void growMoneyUsingPercent() {
        sum *= 1 + percent/100;
    }

}
