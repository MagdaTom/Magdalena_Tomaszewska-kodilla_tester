package com.kodilla.collections.adv.maps.homework;


import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> administration = new HashMap<>();

        Principal john = new Principal("John", "Connor");
        Principal sam = new Principal("Sam", "Becket");
        Principal andrew = new Principal("Andrew", "Butcher");

        School school1 = new School("School no. 1", 10, 7, 8, 9);
        School school2 = new School("School no. 2", 20, 25, 19, 18);
        School school3 = new School("School no. 3", 15, 18, 20, 16);

        administration.put(john, school1);
        administration.put(sam, school2);
        administration.put(andrew, school3);

        for (Map.Entry<Principal, School> principalEntry : administration.entrySet())
            System.out.println(principalEntry.getKey() + " " + principalEntry.getValue().getSchoolName() + ", total number of students: " + principalEntry.getValue().getSum());

    }
}
