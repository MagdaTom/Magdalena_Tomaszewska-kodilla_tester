package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;


public class Warehouse {

    private List<Order> orders = new ArrayList<>();


    public void addOrder(Order order) {
        orders.add(order);
    }


    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders.
                stream()
                .filter(a -> a.getNumber().equals(number))
                .findAny()
                .orElseThrow(OrderDoesntExistException::new);
    }
}















