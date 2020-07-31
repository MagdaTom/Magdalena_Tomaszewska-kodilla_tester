package com.kodilla.spring.basic.spring_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class AnimalFactory {
    @Bean
    public Dog createDog() {
        return new Dog();
    }
    @Bean
    public Animal randomAnimal() {
        Animal animal;
        Random generator = new Random();
        int chosen = generator.nextInt(3);
        if (chosen == 0) {
            animal = new Dog();
        } else if (chosen == 1) {
            animal = new Cat();
        } else {
            animal = new Duck();
        }
        return animal;
    }
}
