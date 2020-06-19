package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
        this.job = new ArAdministrator();
    }

    public void displayResponsibilities() {
        System.out.println(job.getResponsibilities());
    }

    public static void main(String[] args) {

        Person person = new Person("Agnieszka", 27);
        person.displayResponsibilities();
    }

}



