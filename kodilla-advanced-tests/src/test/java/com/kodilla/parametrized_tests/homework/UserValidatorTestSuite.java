package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"MaG-D_a.1", "ab2", "1234"})
    public void shouldReturnTrueIfUsernameRequirementsMet(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ma!-D_a.1", "aa", "", " ", "rød"})
    public void shouldReturnFalseIfUsernameRequirementsNotMet(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a-A_5@C-b5.com", "a-A_5.a-A_5@C-b5.C-b5.com", "a@b.c", "a.1@b.2.europe"})
    public void shouldReturnTrueIfEmailRequirementsMet(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a!A_5@C-b5.com", "aA_5@C-b$5.com", "a-A_5.a&A_5@C-b5.C-b5.com",
            "a-A_5.a-A_5@C-b5ą.C-b5.com", "@b.c", "a.@b.c", "a.b@.pl", "a@", "a@b.", "a@b.abcdefg", " "})
    public void shouldReturnFalseIfEmailRequirementsNotMet(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfEmailIsEmpty(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNull(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}