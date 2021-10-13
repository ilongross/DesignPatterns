package com.ilongross.patterns.behavioral.chain_of_responsibility;

public class CheckBalanceStage extends PaymentStage{

    private float balance;

    public CheckBalanceStage(float balance) {
        this.balance = balance;
    }

    @Override
    public boolean checkPayment(Payment payment) {
        if(payment.getSum() <= balance) {
            payment.appendInfo("Balance enough");
            return super.checkNextPayment(payment);
        }
        System.out.println("Changing balance failed!");
        return false;
    }
}
