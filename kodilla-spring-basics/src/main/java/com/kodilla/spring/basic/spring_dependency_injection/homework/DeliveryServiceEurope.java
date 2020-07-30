package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class DeliveryServiceEurope implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            return false;
        }
        return true;
    }
}
