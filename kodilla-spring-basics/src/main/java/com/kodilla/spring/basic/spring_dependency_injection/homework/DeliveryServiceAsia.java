package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class DeliveryServiceAsia implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 10) {
            return false;
        }
        return true;
    }
}
