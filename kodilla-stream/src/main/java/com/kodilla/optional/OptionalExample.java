package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        User user = null;
        //User user = new User("user1", 30, 100, "Test");

        Optional<User> optionalUser = Optional.ofNullable(user);

        String username = optionalUser.orElse(new User("", 0, 0, "")).getName();
        System.out.println(username);

    }
}
