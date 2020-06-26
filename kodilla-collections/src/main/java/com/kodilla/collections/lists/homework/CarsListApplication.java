package com.kodilla.collections.lists.homework;


import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Honda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Honda> hondaCars = new ArrayList<>();
        Honda hondaCivic = new Honda(75);
        hondaCars.add(hondaCivic);
        hondaCars.add(new Honda(150));
        hondaCars.add(new Honda(50));
        hondaCars.add(new Honda(30));


        for(Honda honda : hondaCars) {
            CarUtils.describeCar(honda);
        }

        hondaCars.remove(2);
        hondaCars.remove(hondaCivic);

        System.out.println("Array after removal operation:");
        for(Honda honda : hondaCars) {
            CarUtils.describeCar(honda);
        }
            System.out.println("Array size after removal operation: "+ hondaCars.size());
    }
}
