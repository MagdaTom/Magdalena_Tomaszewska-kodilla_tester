package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class BMI {

    static Stream<Arguments> calculateBMI() {
        return Stream.of(
                Arguments.of(new Person(1.90, 50.5), "Very severely underweight"),
                Arguments.of(new Person(1.70, 50.00), "Underweight"),
                Arguments.of(new Person(1.64, 55.5), "Normal (healthy weight)"),
                Arguments.of(new Person(1.70, 100), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.50, 93), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.60, 250.5), "Obese Class VI (Hyper Obese)"));
    }
}
