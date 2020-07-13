package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {


        User user = new User("user1", 30, 100, "Test");
        User user2 = null;

        Optional<User> optionalUser = Optional.ofNullable(user);
        Optional<User> optionalUser2 = Optional.ofNullable(user2);

        optionalUser.ifPresent(u -> System.out.println(u.getName()));

        optionalUser2.ifPresentOrElse(a -> System.out.println(a.getName()), () -> System.out.println("empty"));



    }
}
