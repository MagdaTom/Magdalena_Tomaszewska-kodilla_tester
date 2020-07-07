package com.kodilla.stream;

import java.util.List;

public class UsersManager {
    public static void main(String[] args) {
        UsersRepository.getUserList()
                .stream()
                .map(UsersManager::getUserName)
                .forEach(un -> System.out.println(un));
    }

    public static String getUserName(User user){
        return user.getName();
    }

}
