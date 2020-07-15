package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"MaG-D_a.1", "ab2"})
    public void shouldReturnTrueIfConditionMatches(String username){
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ma!-D_a.1", "aa" })
    public void shouldReturnFalseIfConditionNotMatched(String username){
        assertFalse(userValidator.validateUsername(username));
    }


}