package com.ilongross.patterns.home_works.lab6.banking;

public class OfferCreditOperation extends BankOperation {

    public OfferCreditOperation(Bank bank) {
        super(bank);
    }

    @Override
    protected boolean execute() {
        if(bank.getBalance() - sum >= 0) {
            bank.withdrawMoneyFromBalance(sum);
            return  true;
        }
        return false;
    }

    @Override
    public void undo() {
        bank.appendMoneyToBalance(sum);
    }
}
