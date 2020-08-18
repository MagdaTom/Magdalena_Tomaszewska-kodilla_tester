package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.time.LocalTime;

@SpringBootTest
public class ClockTestSuite{

    @RepeatedTest(5)
    public void shouldReturnCurrentTime() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock time1 = context.getBean(Clock.class);
        Clock time2 = context.getBean(Clock.class);
        Clock time3 = context.getBean(Clock.class);
        LocalTime one = time1.getTime();
        LocalTime two = time2.getTime();
        LocalTime three = time3.getTime();

        Assertions.assertNotEquals(one, two);
        Assertions.assertNotEquals(two, three);
        Assertions.assertNotEquals(one, three);
    }
}