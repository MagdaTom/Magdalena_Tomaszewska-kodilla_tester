package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

@Configuration
public class CarFactory {


    LocalTime time;
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
        int number = random.nextInt(3);
        return Season.values()[number];
    }


//    @Bean
//    public Car returnCar2(Season season, LocalTime time) {
//        Car car;
//
//        LocalTime start = LocalTime.parse("20:00:00");
//        LocalTime stop = LocalTime.of(6,0);
//
//        if (season.equals(Season.SUMMER) && time.isBefore(start) && time.isAfter(stop)) {
//            return new Cabrio();
//        } else if (season.equals("Winter")) {
//            return new SUV();
//        } else {
//            return new Sedan();
//        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarFactory that = (CarFactory) o;
        return Objects.equals(car, that.car) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, time);
    }

    @Override
    public String toString() {
        return "CarFactory{" +
                "car=" + car +
                ", time=" + time +
                '}';
    }
}
