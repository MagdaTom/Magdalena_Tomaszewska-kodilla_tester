package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldReturnNumberOfDeposits(){
        Bank bank = new Bank();
        bank.performTransactionB(1000);
        bank.performTransactionB(-500);
        bank.performTransactionB(500);
        assertEquals(2, bank.numberOfDeposits(bank.getCashmachineB()));
    }

    @Test
    public void shouldReturnNumberOfWithdrawals() { //TODO
        Assertions.fail("Not implemented yet");
    }






    }



