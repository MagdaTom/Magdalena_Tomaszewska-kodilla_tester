package com.kodilla.collections.lists.homework;


import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Honda hondaCivic = new Honda(75);
        cars.add(hondaCivic);
        cars.add(new Opel(150));
        cars.add(new Opel(50));
        cars.add(new Honda(30));
        cars.add(new Fiat(80));


        for(Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(2);
        cars.remove(hondaCivic);

        System.out.println("Array after removal operation:");
        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
            System.out.println("Array size after removal operation: "+ cars.size());
    }
}
