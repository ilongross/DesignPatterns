package com.ilongross.patterns.gof.behavioral.chain_of_responsibility;

public class MakePaymentStage extends PaymentStage{


    @Override
    public boolean checkPayment(Payment payment) {
        System.out.println("Making a payment " + payment);
        return true;
    }
}
