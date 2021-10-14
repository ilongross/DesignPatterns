package com.ilongross.patterns.home_works.lab6.banking;

public class ShowCurrenciesOperation extends BankOperation{
    public ShowCurrenciesOperation(Bank bank) {
        super(bank);
    }

    @Override
    protected boolean execute() {
        bank.showCurrencies();
        return true;
    }

    @Override
    public void undo() {

    }
}
