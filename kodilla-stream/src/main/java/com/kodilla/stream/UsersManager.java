package com.kodilla.stream;

import java.util.List;

public class UsersManager {
    public static void main(String[] args) {
        UsersRepository.getUserList()
                .stream()
                .map(u -> u.getName())
                .forEach(un -> System.out.println(un));
    }
}
