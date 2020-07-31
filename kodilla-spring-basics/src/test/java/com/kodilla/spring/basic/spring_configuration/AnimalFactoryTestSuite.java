package com.kodilla.spring.basic.spring_configuration;

import com.kodilla.spring.basic.dependency_injection.homework.Application;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AnimalFactoryTestSuite {
    @Test
    public void testDogCreated() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Dog dog = (Dog) context.getBean("createDog");
        //when
        String voice = dog.getVoice();
        //then
        Assertions.assertEquals("Bark bark", voice);
    }

    @RepeatedTest(5)
    public void shouldCreateRandomAnimal() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Animal animal = (Animal) context.getBean("randomAnimal");
        //When
        String voice = animal.getVoice();
        System.out.println(voice); //bez tego zadziala takze - sluzy tylko wypisaniu jaki glos zostal wylosowany
        //Then
        List<String> possibleVoices = Arrays.asList("Bark bark", "Meow meow", "Quack quack");
        Assertions.assertTrue(possibleVoices.contains(voice));
    }
}