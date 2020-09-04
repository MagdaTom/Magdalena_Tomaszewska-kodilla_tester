package com.kodilla.banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CashMachine {

    List<Double> cashMachine = new ArrayList<>();
    double cashMachineBalance;
    double customerBalance;

    public CashMachine() {
        this.cashMachine = cashMachine;
        this.cashMachineBalance = cashMachineBalance;
        this.customerBalance = customerBalance;
    }

    public void setCashMachineBalance(double accountBalance) {
        this.cashMachineBalance = accountBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }

    public double getCustomerBalance() {
        double balance = this.customerBalance;
        for (Double cash : cashMachine) {
            balance += (cash);
        }
        return balance;
    }

    public double getCashMachineBalanceBalance() {
        double balance = this.cashMachineBalance;
        for (Double cash : cashMachine) {
            balance += (cash);
        }
        return balance;
    }

    public void makeTransaction(double amount) {
        if (amount == 0) {
            try {
                throw new IncorrectAmountException();
            } catch (IncorrectAmountException e) {
                System.out.println(" Transaction amount can't be zero");
            }
            return;
        }
        if (getCashMachineBalanceBalance() + (amount) < 0){
            try {
                throw new IncorrectAmountException();
            } catch (IncorrectAmountException e) {
                System.out.println("The amount is higher then cashMachine balance. Choose amount <= " + getCashMachineBalanceBalance());
            }
        return;
    }
        if(getCustomerBalance() + (amount) < 0){
            try {
                throw new IncorrectAmountException();
            } catch (IncorrectAmountException e) {
                System.out.println("The amount is higher then account balance. Choose amount <= " + getCustomerBalance());
            }
            return;
        }
        cashMachine.add(amount);
    }

    public int numberOfAllTransactions(){
        return cashMachine.size();
    }

    public List<Double> displayTransactions(){
        return cashMachine.stream().collect(Collectors.toList());
    }

    public int numberOfPositiveTransactions(){
        int number =0;
        for(Double cash : cashMachine){
            if(cash > 0){
                number ++;
            }
        }
        return number;
    }

    public int numberOfNegativeTransactions(){
        int number =0;
        for(Double cash : cashMachine){
            if(cash < 0){
                number ++;
            }
        }
        return number;
    }

    public List<Double> displayPositiveTransactions(){
        return cashMachine.stream()
                .filter(a-> a > 0)
        .collect(Collectors.toList());
    }

    public List<Double> displayNegativeTransactions(){
        return cashMachine.stream()
                .filter(a-> a < 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine();
        cashMachine.setCashMachineBalance(2000);
        cashMachine.setCustomerBalance(3000);
        cashMachine.makeTransaction(2000);
        System.out.println(cashMachine.getCustomerBalance());
        System.out.println(cashMachine.getCashMachineBalanceBalance());
        cashMachine.makeTransaction(-1500);
        System.out.println(cashMachine.getCustomerBalance());
        System.out.println(cashMachine.getCashMachineBalanceBalance());
        cashMachine.makeTransaction(-3000);
        System.out.println(cashMachine.getCustomerBalance());
        System.out.println(cashMachine.getCashMachineBalanceBalance());
        cashMachine.makeTransaction(0);
        cashMachine.makeTransaction(5000);
        System.out.println(cashMachine.getCustomerBalance());
        System.out.println(cashMachine.getCashMachineBalanceBalance());
        cashMachine.makeTransaction(-10000);
        System.out.println(cashMachine.getCustomerBalance());
        System.out.println(cashMachine.getCashMachineBalanceBalance());
        System.out.println(cashMachine.numberOfAllTransactions());
        System.out.println(cashMachine.displayTransactions());
        System.out.println(cashMachine.numberOfPositiveTransactions());
        System.out.println(cashMachine.numberOfNegativeTransactions());
        System.out.println(cashMachine.displayPositiveTransactions());
        System.out.println(cashMachine.displayNegativeTransactions());






    }
}
