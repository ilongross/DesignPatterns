package com.ilongross.patterns.structural.proxy.base_proxy;

public class CreditCardAsProxy implements PaymentAgent{

    private Cash cash;
    private float creditBalance;


    public CreditCardAsProxy() {
//        this.cash = cash;
        this.creditBalance = 0;
    }

    public void setCash(Cash cash) {
        this.cash = cash;
    }

    @Override
    public float makePayment(float sum) throws Exception {

        System.out.println("Trying to make payment using credit card");
        float result = cash.makePayment(sum);

        creditBalance += sum;
        System.out.println("You use credit money for " + creditBalance);

        return result;
    }
}
