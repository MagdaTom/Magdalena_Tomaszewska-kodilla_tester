package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldDisplayGivenValue(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        Double number = bean.display(5);
        Assertions.assertEquals(5, number, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultOfAddingTwoPositiveNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.add(5, 6);
        Assertions.assertEquals(11.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultOfAddingTwoNegativeNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.add(-5, -6);
        Assertions.assertEquals(-11.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultOfAddingZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.add(5, 0);
        Assertions.assertEquals(5.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultOfDeductingTwoPositiveNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.subtract(5, 6);
        Assertions.assertEquals(-1.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultOfDeductingTwoNegativeNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.subtract(-5, -6);
        Assertions.assertEquals(1.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultOfDeductingZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.subtract(0, 6);
        Assertions.assertEquals(-6.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultOfMultiplyingTwoPositiveNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.multiply(5, 6);
        Assertions.assertEquals(30.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultOfMultiplyingTwoNegativeNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.multiply(-5, -6);
        Assertions.assertEquals(30.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultOfMultiplyingNegativeAndPositiveNumber() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.multiply(-5, 6);
        Assertions.assertEquals(-30.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultOfMultiplyingByZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.multiply(5, 0);
        Assertions.assertEquals(0.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultOfDividingTwoPositiveNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.divide(6, 3);
        Assertions.assertEquals(2.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultOfDividingTwoNegativeNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.divide(-6, -3);
        Assertions.assertEquals(2.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultOfDividingNegativeAndPositiveNumber() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.divide(-12, 5);
        Assertions.assertEquals(-2.4, result, 0.01);
    }

    @Test
    public void shouldReturnZeroWhenDividingByZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.divide(-12, 0);
        Assertions.assertEquals(0.0, result, 0.01);
    }
}