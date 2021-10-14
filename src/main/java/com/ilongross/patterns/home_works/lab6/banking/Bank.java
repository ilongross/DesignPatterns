package com.ilongross.patterns.home_works.lab6.banking;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Bank {

    private float balance;
    private LinkedList<BankOperation> bankOperations = new LinkedList<>();

    private Map<String, Float> currenciesMap = new HashMap<>();
    private String currentCurrency;
    private float currentUSDRate;


    public Bank(float balance) {
        this.balance = balance;
        currentCurrency = "usd";
        currentUSDRate = 1F;
        currenciesMap.put(currentCurrency, currentUSDRate);
    }

    public float getBalance() {
        return balance;
    }

    public String getCurrentCurrency() {
        return currentCurrency;
    }

    public void appendMoneyToBalance(float sum) {
        balance += sum;
    }

    public void withdrawMoneyFromBalance(float sum) {
        balance -= sum;
    }

    public void executeOperation(BankOperation operation) {
        if (operation.execute()) {
            bankOperations.addLast(operation);
        }
    }

    public void undoLastOperation() {
        if (bankOperations.size() > 0) {
            var operation = bankOperations.getLast();
            bankOperations.remove(operation);
            operation.undo();
        }
    }

    public boolean addNewCurrency(String name, float usdRate) {
        if (currenciesMap.containsKey(name)) {
            return false;
        } else {
            currenciesMap.put(name, usdRate);
            return true;
        }
    }

    public void removeCurrencyFromMap(String removableCurrency) {
        if (currenciesMap.size() == 0)
            return;
        if (currenciesMap.containsKey(removableCurrency)) {
            currenciesMap.remove(removableCurrency);
        } else
            return;
    }

    public boolean transferToAnotherCurrency(String currencyForTransfer) {
        if (!currenciesMap.containsKey(currencyForTransfer)) {
            return false;
        } else {
            currentCurrency = currencyForTransfer;
            balance = balance * (currentUSDRate / currenciesMap.get(currencyForTransfer));
            currentUSDRate = currenciesMap.get(currencyForTransfer);
            return true;
        }
    }

    public void showCurrencies () {
        for (String c : currenciesMap.keySet()) {
            System.out.printf("%s = $%.3f\n", c.toUpperCase(), currenciesMap.get(c));
        }
    }

    public void showBalance () {
        System.out.printf("Bank balance: %s %.2f\n", currentCurrency.toUpperCase(), balance);
    }

}
