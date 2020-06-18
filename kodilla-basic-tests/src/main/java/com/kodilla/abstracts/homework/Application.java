package com.kodilla.abstracts.homework;


public class Application {
    public static void main(String[] args) {

        Square square = new Square(6.5);
        System.out.println("Area of a square: " + square.calculateArea());
        System.out.println("Perimeter of a square: " + square.calculatePerimeter());

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Area of a rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of a rectangle: " + rectangle.calculatePerimeter());

        Diamond diamond = new Diamond(10, 5);
        System.out.println("Area of a diamond: " + diamond.calculateArea());
        System.out.println("Perimeter of a diamond: " + diamond.calculatePerimeter());
    }
}
