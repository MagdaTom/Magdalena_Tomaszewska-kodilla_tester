package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
      //  Random random = new Random();
        Car[] cars = new Car[new Random().nextInt(15)+1];
        for(int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for(Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();
        int drawCarBrand = random.nextInt(3);
        int a = random.nextInt(101);
        if(drawCarBrand == 0)
            return new Honda(a);
        else if(drawCarBrand == 1)
            return new Fiat(a);
        else
            return new Opel(a);
    }
}
