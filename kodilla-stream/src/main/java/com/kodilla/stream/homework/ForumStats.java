package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {


        double avg1 = UsersRepository.getUserList()
                .stream()
                .filter(a -> a.getAge() >= 40)
                .map(User::getNumberOfPosts)
                .mapToInt(b -> b)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts made by users 40 years and older: " + avg1);

        double avg2 = UsersRepository.getUserList()
                .stream()
                .filter(a -> a.getAge() < 40)
                .map(User::getNumberOfPosts)
                .mapToDouble(b -> b)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts made by users younger than 40: " + avg2);
    }
}
