package com.ilongross.patterns.behavioral.chain_of_responsibility;

public class AuthClientStage extends PaymentStage{

    @Override
    public boolean checkPayment(Payment payment) {
        if(payment.getPayer().equals("USER1")) {
            payment.appendInfo("Auth confirmed ");
            return super.checkNextPayment(payment);
        }
        System.out.println("Auth failed!");
        return false;
    }
}
