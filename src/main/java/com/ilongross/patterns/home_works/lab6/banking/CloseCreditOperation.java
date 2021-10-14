package com.ilongross.patterns.home_works.lab6.banking;

public class CloseCreditOperation extends BankOperation {

    public CloseCreditOperation(Bank bank) {
        super(bank);
    }

    @Override
    protected boolean execute() {
        bank.appendMoneyToBalance(sum);
        return true;
    }

    @Override
    public void undo() {
        if(bank.getBalance() - sum >= 0) {
            bank.withdrawMoneyFromBalance(sum);
        }
        else {
            System.out.println("Not enough money.");
        }
    }
}
