package com.ilongross.patterns.behavioral.chain_of_responsibility;

public class MakePaymentStage extends PaymentStage{


    @Override
    public boolean checkPayment(Payment payment) {
        System.out.println("Making a payment " + payment);
        return true;
    }
}
