package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void displayResponsibilities() {
        System.out.println(job.getResponsibilities());
    }

    public static void main(String[] args) {

        Person person = new Person("Agnieszka", 27, new ApAdministrator());
        person.displayResponsibilities();
    }

}



