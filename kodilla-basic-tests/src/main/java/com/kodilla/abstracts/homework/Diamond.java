package com.kodilla.abstracts.homework;

public class Diamond extends Shape {
    private double side;
    private double height;

    public Diamond(double side, double height){
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return side * height;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
