package com.ilongross.patterns.gof.behavioral.commands.banking;

import java.util.LinkedList;

public class Bank {
    private float balance;
    private LinkedList<BankOperation> bankOperations = new LinkedList<>();

    public Bank(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void appendMoneyToBalance(float sum) {
        balance += sum;
    }

    public void withdrawMoneyFromBalance(float sum) {
        balance -= sum;
    }

    public void executeOperation(BankOperation operation) {
        if(operation.execute()) {
            bankOperations.addLast(operation);
        }
    }

    public void undoLastOperation() {
        if(bankOperations.size() > 0) {
            var operation = bankOperations.getLast();
            bankOperations.remove(operation);
            operation.undo();
        }
    }

}
