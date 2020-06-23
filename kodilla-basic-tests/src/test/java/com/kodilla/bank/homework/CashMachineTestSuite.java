package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroTransactions() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.numberOfTransactions());
    }

    @Test
    public void shouldHaveZeroBalance() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.displayBalance());
    }

    @Test
    public void shouldHaveOpeningBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.setOpeningBalance(1000);
        assertEquals(1000, cashMachine.displayOpeningBalance());
    }

    @Test
    public void shouldReturnZeroWhenNegativeOpeningBalance(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.setOpeningBalance(-1000);
        assertEquals(0, cashMachine.displayOpeningBalance());
    }

    @Test
    public void shouldAddTwoTransactionsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.performTransaction(100);
        cashMachine.performTransaction(500);
        assertEquals(2, cashMachine.numberOfTransactions());
    }

    @Test
    public void shouldNotAddTransactionToArrayIfNegativeBalance(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.performTransaction(10);
        cashMachine.performTransaction(500);
        cashMachine.performTransaction(-600);
        cashMachine.performTransaction(1000);
        assertEquals(3, cashMachine.numberOfTransactions());
    }

    @Test
    public void shouldNotAddTransactionToArrayIfZeroTransactionAmount(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.performTransaction(10);
        cashMachine.performTransaction(0);
        cashMachine.performTransaction(1000);
        assertEquals(2, cashMachine.numberOfTransactions());
    }

    @Test
    public void shouldReturnCorrectBalanceIfAllConditionsMet(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.setOpeningBalance(5000);
        cashMachine.performTransaction(10);
        cashMachine.performTransaction(500);
        cashMachine.performTransaction(-100);
        assertEquals(5410, cashMachine.displayBalance());
    }

    @Test
    public void shouldNotIncludeTransactionAmountInBalanceIfNegativeBalance(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.setOpeningBalance(50);
        cashMachine.performTransaction(1000);
        cashMachine.performTransaction(-5000);
        cashMachine.performTransaction(1500);
        assertEquals(2550, cashMachine.displayBalance());
    }
}

