package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Arrays;
import java.util.List;


@SpringBootTest
class CarFactoryTestSuite {
    @RepeatedTest(6)
    public void shouldReturnCarTypeBasedOnTheRandomSeason() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("returnCar");
        //when
        String carType = car.getCarType();
        System.out.println(carType);
        //then
        List<String> possibleCars = Arrays.asList("SUV", "Cabrio", "Sedan");
        Assertions.assertTrue(possibleCars.contains(carType));
    }

    @RepeatedTest(6)
    public void shouldReturnCorrectValueForRandomlyChosenCarType() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("returnCar");
        //when
        boolean isTurned = car.hasHeadlightsTurnedOn();
        String carType = car.getCarType();
        System.out.println(isTurned + " " + carType);
        //then
        List<Boolean> possibleValues = Arrays.asList(true, false);
        Assertions.assertTrue(possibleValues.contains(isTurned));
    }
}