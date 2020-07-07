package com.kodilla.stream;

import java.util.Objects;

public class User {
    private String name;
    private  int age;
    private int numberOfPosts;
    private String group;

    public User(String name, int age, int numberOfPosts, String group) {
        this.name = name;
        this.age = age;
        this.numberOfPosts = numberOfPosts;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                numberOfPosts == user.numberOfPosts &&
                Objects.equals(name, user.name) &&
                Objects.equals(group, user.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, numberOfPosts, group);
    }
}
