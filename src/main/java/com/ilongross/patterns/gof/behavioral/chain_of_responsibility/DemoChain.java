package com.ilongross.patterns.gof.behavioral.chain_of_responsibility;

public class DemoChain {
    public static void main(String[] args) {
        var stage1 = new AuthClientStage();
        var stage2 = new CheckBalanceStage(10000);
        var stage3 = new MakePaymentStage();

        stage1.setPaymentStage(stage2);
        stage2.setPaymentStage(stage3);

        stage1.checkPayment(new Payment("USER2", 1100f, "", ""));
    }
}
