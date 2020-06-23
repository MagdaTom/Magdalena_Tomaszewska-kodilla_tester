package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldReturnTotalBalance() {
        Bank bank = new Bank();
        bank.performTransactionA(1000);
        bank.performTransactionA(-500);
        bank.performTransactionA(5000);
        bank.performTransactionB(5000);
        bank.performTransactionB(-1000);
        bank.performTransactionC(1000);
        bank.performTransactionC(-100);
        assertEquals(10400, bank.totalSumOfBalances());
    }

    @Test
    public void shouldReturnCorrectBalanceIfNegativeBalance() { //testy dla negatywnego balansu robilam juz dla Cashmachine - nalezy je powtorzyc dla sumy wszytskich bankomatow?
        Bank bank = new Bank();
        bank.performTransactionA(1000);
        bank.performTransactionA(-5000);
        bank.performTransactionA(5000);
        bank.performTransactionB(5000);
        bank.performTransactionB(-1000);
        bank.performTransactionC(1000);
        bank.performTransactionC(-100);
        assertEquals(10900, bank.totalSumOfBalances());
    }

    @Test
    public void shouldReturnTotalNumberOfTransactions() {
        Bank bank = new Bank();
        bank.performTransactionA(1000);
        bank.performTransactionA(-500);
        bank.performTransactionA(5000);
        bank.performTransactionB(5000);
        bank.performTransactionB(-1000);
        bank.performTransactionC(1000);
        bank.performTransactionC(-100);
        assertEquals(7, bank.totalNumberOfTransactions());
    }

    @Test
    public void shouldReturnCorrectTotalNumberOfTransactionsIfZeroTransaction() {
        Bank bank = new Bank();
        bank.performTransactionA(1000);
        bank.performTransactionA(-500);
        bank.performTransactionA(0);
        bank.performTransactionB(5000);
        bank.performTransactionB(-1000);
        bank.performTransactionC(1000);
        bank.performTransactionC(-100);
        assertEquals(6, bank.totalNumberOfTransactions());
    }

    @Test
    public void shouldReturnCorrectTotalNumberOfTransactionsIfNegativeBalance() {
        Bank bank = new Bank();
        bank.performTransactionA(-5000);
        bank.performTransactionB(-1000);
        bank.performTransactionC(-100);
        assertEquals(0, bank.totalNumberOfTransactions());
    }

    @Test
    public void shouldReturnTotalNumberOfDeposits() {
        Bank bank = new Bank();
        bank.performTransactionA(1000);
        bank.performTransactionA(-500);
        bank.performTransactionA(5000);
        bank.performTransactionB(5000);
        bank.performTransactionB(-1000);
        bank.performTransactionC(1000);
        bank.performTransactionC(-100);
        assertEquals(4, bank.totalNumberOfDeposits());
    }

    @Test
    public void shouldReturnTotalNumberOfWithdrawals() {
        Bank bank = new Bank();
        bank.performTransactionA(1000);
        bank.performTransactionA(-500);
        bank.performTransactionA(5000);
        bank.performTransactionB(5000);
        bank.performTransactionB(-1000);
        bank.performTransactionC(1000);
        bank.performTransactionC(-100);
        assertEquals(3, bank.totalNumbersOfWithdrawals());
    }

    @Test
    public void shouldReturnZeroNumberOfWithdrawalsIfNoneWithdrawals() {
        Bank bank = new Bank();
        bank.performTransactionA(1000);
        bank.performTransactionA(5000);
        bank.performTransactionB(5000);
        bank.performTransactionC(10);
        assertEquals(0, bank.totalNumbersOfWithdrawals());

    }

    @Test
    public void shouldReturnZeroNumberOfDepositsIfNoneDeposits() {
        Bank bank = new Bank();
        bank.performTransactionA(-500);
        bank.performTransactionB(-1000);
        bank.performTransactionC(-100);
        assertEquals(0, bank.totalNumberOfDeposits());
    }
    @Test
    public void shouldReturnZeroNumberOfWithdrawalsIfNegativeBalance() {
        Bank bank = new Bank();
        bank.performTransactionA(-500);
        bank.performTransactionB(-1000);
        bank.performTransactionC(-100);
        assertEquals(0, bank.totalNumbersOfWithdrawals());
    }
    @Test
    public void shouldReturnCorrectAverageAmountOfDeposit() {
        Bank bank = new Bank();
        bank.performTransactionA(1000);
        bank.performTransactionA(-500);
        bank.performTransactionA(5000);
        bank.performTransactionB(5000);
        bank.performTransactionB(-1000);
        bank.performTransactionC(1000);
        bank.performTransactionC(-100);
        assertEquals(3000, bank.averageAmountOfDeposits());
    }

    @Test
    public void shouldReturnZeroAverageAmountOfDepositIfNoDeposits() {
        Bank bank = new Bank();
        bank.performTransactionA(-500);
        bank.performTransactionB(-1000);
        bank.performTransactionC(-100);
        assertEquals(0.00, bank.averageAmountOfDeposits(), 0.001);
    }

    @Test
    public void shouldReturnCorrectAverageAmountOfWithdrawals() {
        Bank bank = new Bank();
        bank.performTransactionA(1000);
        bank.performTransactionA(-500);
        bank.performTransactionA(5000);
        bank.performTransactionB(5000);
        bank.performTransactionB(-1000);
        bank.performTransactionC(1000);
        bank.performTransactionC(-100);
        assertEquals(-533.00, bank.averageAmountOfWithdrawals(), 0.001);
    }


    @Test
    public void shouldReturnZeroAverageAmountOfWithdrawalsIfNoWithdrawals() {
        Bank bank = new Bank();
        bank.performTransactionA(500);
        bank.performTransactionB(1000);
        bank.performTransactionC(100);
        assertEquals(0.00, bank.averageAmountOfWithdrawals(), 0.001);
    }
}

