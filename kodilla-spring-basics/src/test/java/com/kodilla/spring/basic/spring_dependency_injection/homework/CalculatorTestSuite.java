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
        Assertions.assertEquals(java.util.Optional.of(5.0), java.util.Optional.of(number));
    }

    @Test
    public void shouldReturnCorrectResultOfAddingTwoPositiveNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.add(5, 6);
        Assertions.assertEquals(java.util.Optional.of(11.0), java.util.Optional.of(result));
    }

    @Test
    public void shouldReturnCorrectResultOfAddingTwoNegativeNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.add(-5, -6);
        Assertions.assertEquals(java.util.Optional.of(-11.0), java.util.Optional.of(result));
    }

    @Test
    public void shouldReturnCorrectResultOfAddingZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.add(5, 0);
        Assertions.assertEquals(java.util.Optional.of(5.0), java.util.Optional.of(result));
    }

    @Test
    public void shouldReturnCorrectResultOfDeductingTwoPositiveNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.subtract(5, 6);
        Assertions.assertEquals(java.util.Optional.of(-1.0), java.util.Optional.of(result));
    }

    @Test
    public void shouldReturnCorrectResultOfDeductingTwoNegativeNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.subtract(-5, -6);
        Assertions.assertEquals(java.util.Optional.of(1.0), java.util.Optional.of(result));
    }

    @Test
    public void shouldReturnCorrectResultOfDeductingZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.subtract(0, 6);
        Assertions.assertEquals(java.util.Optional.of(-6.0), java.util.Optional.of(result));
    }

    @Test
    public void shouldReturnCorrectResultOfMultiplyingTwoPositiveNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.multiply(5, 6);
        Assertions.assertEquals(java.util.Optional.of(30.0), java.util.Optional.of(result));
    }

    @Test
    public void shouldReturnCorrectResultOfMultiplyingTwoNegativeNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.multiply(-5, -6);
        Assertions.assertEquals(java.util.Optional.of(30.0), java.util.Optional.of(result));
    }

    @Test
    public void shouldReturnCorrectResultOfMultiplyingNegativeAndPositiveNumber() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.multiply(-5, 6);
        Assertions.assertEquals(java.util.Optional.of(-30.0), java.util.Optional.of(result));
    }

    @Test
    public void shouldReturnCorrectResultOfMultiplyingByZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.multiply(5, 0);
        Assertions.assertEquals(java.util.Optional.of(0.0), java.util.Optional.of(result));
    }

    @Test
    public void shouldReturnCorrectResultOfDividingTwoPositiveNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.divide(6, 3);
        Assertions.assertEquals(java.util.Optional.of(2.0), java.util.Optional.of(result));
    }

    @Test
    public void shouldReturnCorrectResultOfDividingTwoNegativeNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.divide(-6, -3);
        Assertions.assertEquals(java.util.Optional.of(2.0), java.util.Optional.of(result));
    }

    @Test
    public void shouldReturnCorrectResultOfDividingNegativeAndPositiveNumber() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.divide(-12, 5);
        Assertions.assertEquals(java.util.Optional.of(-2.4), java.util.Optional.of(result));
    }

    @Test
    public void shouldReturnZeroWhenDividingByZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.divide(-12, 0);
        Assertions.assertEquals(java.util.Optional.of(0.0), java.util.Optional.of(result));
    }
}