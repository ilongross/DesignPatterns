package com.ilongross.patterns.behavioral.commands.banking;

public abstract class BankOperation {
    protected Bank bank;
    private float prevBalance;
    protected float sum;

    public BankOperation(Bank bank) {
        this.bank = bank;
    }

    protected abstract boolean execute();

    public void backUp() {
        prevBalance = bank.getBalance();
    }

    public abstract void undo();

}

