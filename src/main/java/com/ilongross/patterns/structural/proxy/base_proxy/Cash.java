package com.ilongross.patterns.structural.proxy.base_proxy;

public class Cash implements PaymentAgent{

    private float balance;

    public Cash(float balance) {
        this.balance = balance;
    }

    @Override
    public float makePayment(float sum) throws Exception {
        if(sum > 0 && balance - sum >= 0) {
            balance -= sum;
            return balance;
        }
        else {
            throw new Exception("Wrong sum");
        }
    }

    @Override
    public String toString() {
        return "Cash{" +
                "balance=" + balance +
                '}';
    }
}
