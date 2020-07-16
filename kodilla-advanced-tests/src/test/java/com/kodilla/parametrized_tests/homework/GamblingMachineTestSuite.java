package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/fileWithCorrectNumberOfElements.csv", numLinesToSkip = 1)
    public void shouldReturnTrueIfCorrectSetOfNumbersProvided(int number1, int number2, int number3, int number4, int number5, int number6) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);
        assertTrue(gamblingMachine.howManyWins(numbers) <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/fileWithNumbersOutOfRange.csv", numLinesToSkip = 1)
    public void shouldReturnZeroIfUserNumbersOutOfRange(int number1, int number2, int number3, int number4, int number5, int number6) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);
        assertEquals(0, gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/fileWithCorrectNumberOfElements.csv", numLinesToSkip = 1)
    public void shouldReturnExceptionMessageIfLessThen6NumbersProvided(int number1, int number2, int number3, int number4, int number5, int number6) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        Throwable thrown = assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
        assertEquals("Wrong numbers provided", thrown.getMessage());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/fileWithNegativeNumber.csv", numLinesToSkip = 1)
    public void shouldReturnExceptionMessageIfNegativeNumberProvided(int number1, int number2, int number3, int number4, int number5, int number6)  {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);
        Throwable thrown = assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
        assertEquals("Wrong numbers provided", thrown.getMessage());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/fileWithNumberZero.csv", numLinesToSkip = 1)
    public void shouldReturnExceptionMessageIfNumberZeroProvided(int number1, int number2, int number3, int number4, int number5, int number6)  {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);
        Throwable thrown = assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
        assertEquals("Wrong numbers provided", thrown.getMessage());
    }
}