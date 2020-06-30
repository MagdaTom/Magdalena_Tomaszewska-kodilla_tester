package com.kodilla.collections.sets.homework;


import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Bull's Eye", 20, 25.5, false));
        stamps.add(new Stamp("Penny Black", 20, 24, true));
        stamps.add(new Stamp("Treskilling Yellow", 25, 30, true));
        stamps.add(new Stamp("Bull's Eye", 20, 25.5, false));
        stamps.add(new Stamp("Inverted Jenny ", 21.50, 24, false));
        stamps.add(new Stamp("Penny Black", 20, 24, true));
        stamps.add(new Stamp("Penny Black", 20, 24, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
