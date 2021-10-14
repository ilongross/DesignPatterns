package com.ilongross.patterns.home_works.lab6.banking;

public class ShowBalanceOperation extends BankOperation{

    public ShowBalanceOperation(Bank bank) {
        super(bank);
    }

    @Override
    protected boolean execute() {
        bank.showBalance();
        return true;
    }

    @Override
    public void undo() {

    }
}
