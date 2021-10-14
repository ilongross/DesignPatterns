package com.ilongross.patterns.home_works.lab6.banking;

import com.ilongross.patterns.home_works.lab6.banking.Bank;
import com.ilongross.patterns.home_works.lab6.banking.BankOperation;

public class AddNewCurrencyOperation extends BankOperation {

    private String currencyName;
    private float currencyUsdRate;

    public AddNewCurrencyOperation(Bank bank, String currencyName, float currencyUsdRate) {
        super(bank);
        this.currencyName = currencyName;
        this.currencyUsdRate = currencyUsdRate;
    }

    @Override
    protected boolean execute() {
        if(bank.addNewCurrency(currencyName, currencyUsdRate)) {
            return true;
        }
        System.out.println("Currency has already been added!");
        return false;
    }

    @Override
    public void undo() {
        if(currencyName.equals("usd")) {
            System.out.println("It is impossible to delete the default currency");
            return;
        }
        bank.removeCurrencyFromMap(currencyName);
        bank.undoLastOperation();

    }



}
