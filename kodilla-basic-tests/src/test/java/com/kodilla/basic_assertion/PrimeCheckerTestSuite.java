package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeCheckerTestSuite {
    private PrimeChecker checker = new PrimeChecker();
    private static int count = 0;

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        boolean result = checker.isPrime(14);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {
        boolean result = checker.isPrime(13);
        count++;
        System.out.println("Test number " + count);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        boolean result = checker.isPrime(2);
        count++;
        System.out.println("Test number " + count);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {
        boolean result = checker.isPrime(1);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        boolean result = checker.isPrime(0);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        boolean result = checker.isPrime(-6);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);

    }

    @Test
    public void countChecker(){
        checker.incrementCount();
        checker.incrementCount();
        int countNumber = checker.getCount();
        assertEquals(2, countNumber);
    }
}
//Zmienna statyczna należy do klasy, a nie do obiektu. Dzięki temu raz ustawiona wartość jest "zapamiętywana" pomiędzy poszczególnymi wywołaniami.