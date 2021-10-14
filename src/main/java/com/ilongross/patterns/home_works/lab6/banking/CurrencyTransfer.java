package com.ilongross.patterns.home_works.lab6.banking;

public class CurrencyTransfer extends BankOperation{

    private String currencyForTransfer;
    private String previousCurrency;

    public CurrencyTransfer(Bank bank, String currencyForTransfer) {
        super(bank);
        previousCurrency = bank.getCurrentCurrency();
        this.currencyForTransfer = currencyForTransfer;
    }

    @Override
    protected boolean execute() {
        previousCurrency = bank.getCurrentCurrency();
        if(bank.transferToAnotherCurrency(currencyForTransfer)) {
            System.out.println("Transfer completed!");
            return true;
        }
        System.out.println("Transfer failed");
        return false;
    }

    @Override
    public void undo() {
        if(bank.transferToAnotherCurrency(previousCurrency)) {
            System.out.println("Bank account returned to " + previousCurrency.toUpperCase());
        }
        else {
            System.out.println("Transfer reverse ERROR.");
        }
    }



}
