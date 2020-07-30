package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class NotificationServiceAsia implements NotificationService {
    @Override
    public String success(String address) {
        return "Delivered to: " + address;
    }

    @Override
    public String fail(String address) {
        return "Not delivered to: " + address;
    }
}
