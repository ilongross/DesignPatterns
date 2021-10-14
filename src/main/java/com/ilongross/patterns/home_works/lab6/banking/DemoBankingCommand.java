package com.ilongross.patterns.home_works.lab6.banking;

public class DemoBankingCommand {
    public static void main(String[] args) {

        var bank = new Bank(10000);
        var newCurrencyOp1 = new AddNewCurrencyOperation(bank, "usd", 1F);
        var newCurrencyOp2 = new AddNewCurrencyOperation(bank, "gbp", 1.37F);
        var newCurrencyOp3 = new AddNewCurrencyOperation(bank, "rub", 0.014F);
        var showCurrenciesOp = new ShowCurrenciesOperation(bank);
        var showBalanceOp = new ShowBalanceOperation(bank);
        var transferToGBP = new CurrencyTransfer(bank, "gbp");
        var transferToUSD = new CurrencyTransfer(bank, "usd");
        var transferToRUB = new CurrencyTransfer(bank, "rub");

        bank.executeOperation(newCurrencyOp1);
        bank.executeOperation(newCurrencyOp2);
        bank.executeOperation(newCurrencyOp3);
        bank.executeOperation(showBalanceOp);

        bank.executeOperation(transferToGBP);
        bank.executeOperation(showBalanceOp);
        bank.executeOperation(transferToRUB);
        bank.executeOperation(showBalanceOp);
        bank.executeOperation(transferToUSD);
        bank.executeOperation(showBalanceOp);

        bank.undoLastOperation();
        bank.undoLastOperation();
        bank.undoLastOperation();
        bank.undoLastOperation();
        bank.undoLastOperation();
        bank.undoLastOperation();
        bank.undoLastOperation();

        bank.executeOperation(showBalanceOp);

    }
}
