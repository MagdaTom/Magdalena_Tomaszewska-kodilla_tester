package com.kodilla.spring.basic.spring_scopes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
class TaskTestSuite {

        @Test
        public void shouldCreateDifferentTasks() {
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Task firstBean = context.getBean(Task.class);
            Task secondBean = context.getBean(Task.class);
            Task thirdBean = context.getBean(Task.class);
            Assertions.assertNotEquals(firstBean, secondBean);
            Assertions.assertNotEquals(secondBean, thirdBean);
            Assertions.assertNotEquals(firstBean, thirdBean);
        }
    }