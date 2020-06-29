package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Bull's Eye", "20mm x 25.50mm", false));
        stamps.add(new Stamp("Penny Black", "20mm x 24mm", true));
        stamps.add(new Stamp("Treskilling Yellow", "25mm x 30mm", true));
        stamps.add(new Stamp("Bull's Eye", "20mm x 25.50mm", false));
        stamps.add(new Stamp("Inverted Jenny ", "21.50mm x 24mm", false));
        stamps.add(new Stamp("Penny Black", "20mm x 24mm", true));
        stamps.add(new Stamp("Penny Black", "20mm x 24mm", true));

        System.out.println(stamps.size());
        for(Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
