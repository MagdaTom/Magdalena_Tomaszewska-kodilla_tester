package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;
    private int openingBalance;


    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
        this.openingBalance = openingBalance;
    }

    public void performTransaction(int transaction) {
        if (displayBalance() + transaction < 0 || transaction == 0) {
            return;
        }
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }

    public int[] getTransaction() {
        return transactions;
    }

    public void setOpeningBalance(int openingBalance) {
        if (openingBalance >= 0) {
            this.openingBalance = openingBalance;
        } else {
            System.err.println("Negative balance can't be set");
        }
    }

    public int displayOpeningBalance() {
        return openingBalance;
    }

    public int displayBalance() {
        int balance = openingBalance;
        for (int i = 0; i < transactions.length; i++) {
            balance += (this.transactions[i]);
        }
        return balance;
    }

    public int numberOfTransactions() {
        return transactions.length;
    }
}



