package com.kodilla.abstracts.homework;

public class Diamond extends Shape {
    double side;
    double height;

    public Diamond(double side, double height){
        this.side = side;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return 4 * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * height;
    }
}
