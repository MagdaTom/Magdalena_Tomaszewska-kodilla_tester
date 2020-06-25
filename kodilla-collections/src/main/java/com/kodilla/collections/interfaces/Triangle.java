package com.kodilla.collections.interfaces;

import java.util.Objects;

public class Triangle implements Shape{
    private double width;
    private double height;
    private double hypotenuse;

public Triangle(double width, double height, double hypotenuse){
    this.width = width;
    this.height = height;
    this.hypotenuse = hypotenuse;
}


    @Override
    public double getArea() {
        return width * height / 2;
    }

    @Override
    public double getPerimeter() {
        return width + height + hypotenuse;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                ", hypotenuse=" + hypotenuse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.width, width) == 0 &&
                Double.compare(triangle.height, height) == 0 &&
                Double.compare(triangle.hypotenuse, hypotenuse) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, hypotenuse);
    }
}
