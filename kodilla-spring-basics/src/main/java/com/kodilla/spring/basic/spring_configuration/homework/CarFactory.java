package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

@Configuration
public class CarFactory {

    Car car;

    @Bean
    public Car returnCar() {
        Map<Season, Car> seasonCarMap = new HashMap<>();
        seasonCarMap.put(Season.SUMMER, new Cabrio());
        seasonCarMap.put(Season.WINTER, new SUV());
        seasonCarMap.put(Season.SPRING, new Sedan());
        seasonCarMap.put(Season.AUTUMN, new Sedan());
        return seasonCarMap.get(randomSeason());
    }

    private Season randomSeason() {
        Random random = new Random();
        int number = random.nextInt(4);
        return Season.values()[number];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarFactory that = (CarFactory) o;
        return Objects.equals(car, that.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car);
    }

    @Override
    public String toString() {
        return "CarFactory{" +
                "car=" + car +
                '}';
    }
}
