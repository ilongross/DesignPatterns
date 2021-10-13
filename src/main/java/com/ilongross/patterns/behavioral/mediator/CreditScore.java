package com.ilongross.patterns.behavioral.mediator;

public class CreditScore extends Score{

    private float creditLoan;
    private float limit;
    private boolean isBlockedByLoan = false;

    public CreditScore(float sum, String number, String owner, float creditLoan, float limit, boolean isBlockedByLoan) {
        super(sum, number, owner);
        this.creditLoan = creditLoan;
        this.limit = limit;
        this.isBlockedByLoan = isBlockedByLoan;
    }

    @Override
    public void depositMoney(float money) {
        creditLoan -= money;
        if(creditLoan > limit) {
            isBlockedByLoan = false;
        }
    }

    @Override
    public void withdrawMoney(float money) {
        if(!isBlockedByLoan && (creditLoan + money <= limit)) {
            creditLoan += money;
            if(creditLoan >= limit) {
                isBlockedByLoan = true;
            }
        }
    }

    public boolean isBlockedByLoan() {
        return isBlockedByLoan;
    }
}
