package com.kodilla.bank.homework;

public class Bank {

    private int transaction;
    private CashMachine cashMachineA;
    private CashMachine cashMachineB;
    private CashMachine cashMachineC;

    public Bank() {
        this.transaction = transaction;
        this.cashMachineA = new CashMachine();
        this.cashMachineB = new CashMachine();
        this.cashMachineC = new CashMachine();
    }

    public CashMachine getCashMachineA() {
        return cashMachineA;
    }

    public CashMachine getCashMachineB() {
        return cashMachineB;
    }

    public CashMachine getCashMachineC() {
        return cashMachineC;
    }

    public void performTransactionA(int transaction) {
        this.cashMachineA.performTransaction(transaction);
    }

    public void performTransactionB(int transaction) {
        this.cashMachineB.performTransaction(transaction);
    }

    public void performTransactionC(int transaction) {
        this.cashMachineC.performTransaction(transaction);
    }



    public int sumOfDeposits(CashMachine cashMachine) {
        int result = 0;
        for (int i = 0; i < cashMachine.numberOfTransactions(); i++) {
            if (cashMachine.getTransaction()[i] > 0) {
                result += cashMachine.getTransaction()[i];
            }
        }
        return result;
    }

    public int sumOfWithdrawals(CashMachine cashMachine) {
        int result = 0;
        for (int i = 0; i < cashMachine.numberOfTransactions(); i++) {
            if (cashMachine.getTransaction()[i] < 0) {
                result += cashMachine.getTransaction()[i];
            }
        }
        return result;
    }

    public int numberOfDeposits(CashMachine cashMachine){
        int result = 0;
        for (int i = 0; i < cashMachine.numberOfTransactions(); i++) {
            if (cashMachine.getTransaction()[i] > 0) {
                result ++;
            }
        }
        return result;
    }

    public int numberOfWithdrawals(CashMachine cashMachine){
        int result = 0;
        for (int i = 0; i < cashMachine.numberOfTransactions(); i++) {
            if (cashMachine.getTransaction()[i] < 0) {
                result ++;
            }
        }
        return result;
    }

    public int totalSumOfBalances() {
        return cashMachineA.displayBalance() + cashMachineB.displayBalance() + cashMachineC.displayBalance();
    }

    public int totalNumberOfTransactions() {
        return cashMachineA.numberOfTransactions() + cashMachineB.numberOfTransactions() + cashMachineC.numberOfTransactions();
    }

    public int totalNumberOfDeposits(){
        return numberOfDeposits(cashMachineA) + numberOfDeposits(cashMachineB) + numberOfDeposits(cashMachineC);
    }

    public int totalNumbersOfWithdrawals(){
        return numberOfWithdrawals(cashMachineA) + numberOfWithdrawals(cashMachineB) + numberOfWithdrawals(cashMachineC);
    }

    public int totalSumOfDeposits(){
        return sumOfDeposits(cashMachineA) +  sumOfDeposits(cashMachineB) + sumOfDeposits(cashMachineC);
    }

    public int totalSumOfWithdrawals(){
        return sumOfWithdrawals(cashMachineA) + sumOfWithdrawals(cashMachineB)+ sumOfWithdrawals(cashMachineC);
    }

    public double averageAmountOfDeposits() {
        if(totalNumberOfDeposits()==0 ){
            return 0;
        }
        return totalSumOfDeposits() / totalNumberOfDeposits();
    }

    public double averageAmountOfWithdrawals() {
        if(totalNumbersOfWithdrawals()==0 ){
            return 0;
        }
        return totalSumOfWithdrawals() / totalNumbersOfWithdrawals();
    }
}





