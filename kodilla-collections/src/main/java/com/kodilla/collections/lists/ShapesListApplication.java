package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();
        Square sq1 = new Square(10.0);
        shapes.add(sq1);                    // dodawanie elementow na dwa sposoby;
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

        for (int n = 0; n < shapes.size(); n++)//wyswietlanie obiektow zapisanych w kolekcji shapes
            System.out.println(shapes.get(n));

        for(int n = 0; n < shapes.size(); n++){ // wyświetlimy tylko te obiekty z kolekcji, których pole powierzchni jest większe od 20
            Square square = shapes.get(n);
            if(square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }

        for(Square square : shapes){ // petla for-each
            if(square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }

        shapes.remove(sq1);
        System.out.println(shapes.size());
        shapes.remove(new Square(1.0));
        System.out.println(shapes.size());
    }
}