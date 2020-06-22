package com.kodilla.bank.homework;

public class Bank {

    private int transaction;
    private CashMachine cashmachineA;
    private CashMachine cashmachineB;
    private CashMachine cashmachineC;
    private int depositNumber;
    private int withdrawalNumber;



    public Bank() {
        this.transaction = transaction;
        this.cashmachineA = new CashMachine();
        this.cashmachineB = new CashMachine();
        this.cashmachineC = new CashMachine();

    }

    public CashMachine getCashmachineB() {
        return cashmachineB;
    }

    public void performTransactionA(int transaction) {
        this.cashmachineA.performTransaction(transaction);
    }

    public void performTransactionB(int transaction) {
        this.cashmachineB.performTransaction(transaction);
    }

    public void performTransactionC(int transaction) {
        this.cashmachineC.performTransaction(transaction);
    }

    public int sumOfBalances() {
        return cashmachineA.displayBalance() + cashmachineB.displayBalance() + cashmachineC.displayBalance();

    }

    public int totalNumberOfTransactions() {
        int sum = 0;
        sum += cashmachineA.numberOfTransactions() + cashmachineB.numberOfTransactions() + cashmachineC.numberOfTransactions();
        return sum;

    }

    public int sumOfDeposits(CashMachine cashmachine) {//TODO cashMachine
        int result = 0;
        for (int i = 0; i < cashmachine.numberOfTransactions(); i++) {
            if (cashmachine.getTransaction()[i] > 0) {
                result += cashmachine.getTransaction()[i];
            }
        }
        return result;
    }

    public int sumOfWithdrawals(CashMachine cashmachine) {
        int result = 0;
        for (int i = 0; i < cashmachine.numberOfTransactions(); i++) {
            if (cashmachine.getTransaction()[i] < 0) {
                result += cashmachine.getTransaction()[i];
            }
        }
        return result;
    }

    public int numberOfDeposits(CashMachine cashmachine){
        int result = 0;
        for (int i = 0; i < cashmachine.numberOfTransactions(); i++) {
            if (cashmachine.getTransaction()[i] > 0) {
                result ++;
            }
        }
        return result;
    }

    public int totalNumberOfDeposits(){
        return numberOfDeposits(cashmachineA) + numberOfDeposits(cashmachineB) + numberOfDeposits(cashmachineC);
    }



 /*   public int averageAmountOfDeposits() { TODO
        return depositsA() + depositsB() + depositsC() / totalNumberOfTransactions();

    }


    public int averageDepositAmount() {
        return sumOfBalances() / totalNumberOfTransactions();
    }
*/


}





