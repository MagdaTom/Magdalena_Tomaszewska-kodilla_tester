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

        for (Student student : students) {
            System.out.println("student: " + student.getName() + ", teacher: " + Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>"));
        }
    }
}

