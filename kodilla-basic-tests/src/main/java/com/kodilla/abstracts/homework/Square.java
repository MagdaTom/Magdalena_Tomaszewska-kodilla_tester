package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
