package com.kodilla.optional.homework;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Jason", new Teacher("Bob")));
        students.add(new Student("Kate", new Teacher("John")));
        students.add(new Student("Sarah", null));
        students.add(new Student("Simon", new Teacher("Laura")));
        students.add(new Student("Mary", null));
        students.add(null);

        for (Student student : students) {
            System.out.print("student: ");
            if (student != null)
                System.out.print(student.getName());
                else
                System.out.print("<undefined>");
            System.out.print(", teacher: ");
            if (student != null)
                if(student.getTeacher() != null)
                    System.out.println(student.getTeacher().getName());
                else
                    System.out.println("<undefined>");
        }
        System.out.println("\n----------------------------------");
        for (Student student : students) {
            System.out.println("student: " +
                    Optional.ofNullable(student)
                            .map(s -> s.getName())
                            .orElse("<undefined>")
                    + ", teacher: " +
                    Optional.ofNullable(student)
                            .map(Student::getTeacher)
                            .map(n -> n.getName())
                            .orElse("<undefined>"));
        }
//        students.stream()
//                .map(Student::getName)
//                .forEach(a -> System.out.println("Student: " + a));
    }
}

