package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    double side;
    double side2;

    public Rectangle(double side, double side2) {
        this.side = side;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side * side2;
    }

    @Override
    public double calculatePerimeter() {
        return (2*side)+(2*side2);
    }
}
