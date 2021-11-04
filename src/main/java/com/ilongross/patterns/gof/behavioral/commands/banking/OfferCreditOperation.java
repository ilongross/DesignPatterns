package com.ilongross.patterns.gof.behavioral.commands.banking;

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
