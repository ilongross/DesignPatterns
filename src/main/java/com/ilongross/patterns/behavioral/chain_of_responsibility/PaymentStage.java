package com.ilongross.patterns.behavioral.chain_of_responsibility;

public abstract class PaymentStage {

    private PaymentStage paymentStage;

    public void setPaymentStage(PaymentStage paymentStage) {
        this.paymentStage = paymentStage;
    }

    public abstract boolean checkPayment(Payment payment);

    protected boolean checkNextPayment(Payment payment) {
        if(paymentStage == null) {
            return true;
        }
        return paymentStage.checkPayment(payment);
    }


}
