package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        Square square = new Square(10.00); // dwa sposoby dodawania - linijk 14+15 lub tylko 16;
        shapes.add(square);
        shapes.add(new Circle(7.0));
        shapes.add(new Triangle(10.0, 4.0, 10.77));
        Triangle triangle = new Triangle(10.0, 4.0, 10.77); //twprzenie referencji - tworzenie nowego obiektu klasy Tringle = musi miec takie same wartosci pol)


        for (Shape shape : shapes) {
            System.out.println(shape + ", area: " + shape.getArea() + ", perimeter: " + shape.getPerimeter());

        }

        shapes.remove(1);  // usuwanie po indeksie
        System.out.println(shapes.size());

        shapes.remove(square);
        System.out.println(shapes.size());

        shapes.remove(triangle);
        System.out.println(shapes.size());


    }
}
//mozna tez bylo zorbic tak: shapes.remove(new Triangle(10,4,10.77) - bez powolywania do zycia zmiennej;