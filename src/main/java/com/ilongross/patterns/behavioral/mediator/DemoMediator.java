package com.ilongross.patterns.behavioral.mediator;

public class DemoMediator {
    public static void main(String[] args) {
        var score1 = new MainScore(10000F, "AAA", "Ilon");
        var score2 = new CreditScore(1000F, "BBB", "Ilon", 1000F, 5000F, false);
        var score3 = new DepositScore(100F, "CCC", "Ilon", 10);

        var madiator = new ScoreMediatorImpl(score1, score2, score3);

        score2.withdrawMoney(1000F);
        score2.withdrawMoney(1000F);
        score2.withdrawMoney(1000F);
        score2.withdrawMoney(1000F);
        score2.withdrawMoney(1000F);
        score2.withdrawMoney(1000F);

        madiator.appendMoneyToMainScore(2000F);
        System.out.println(score1.sum);
        System.out.println(score2.sum);

    }
}
