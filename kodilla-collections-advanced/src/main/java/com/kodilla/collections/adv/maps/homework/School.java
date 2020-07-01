package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class School {
    private String schoolName;
    private List<Integer> numberOfStudents = new ArrayList<>();


    public School(String schoolName, int... numberOfStudents) {
        for (int student : numberOfStudents) {
            this.numberOfStudents.add(student);
        }
        this.schoolName = schoolName;
    }

    public int getSum() {
        int sum = 0;
        for (int student : numberOfStudents)
            sum += student;
        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(schoolName, school.schoolName) &&
                Objects.equals(numberOfStudents, school.numberOfStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, numberOfStudents);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}

