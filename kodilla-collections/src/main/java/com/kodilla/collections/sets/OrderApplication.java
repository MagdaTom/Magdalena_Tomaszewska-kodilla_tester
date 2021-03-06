package com.kodilla.collections.sets;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarOutputStream;
import java.util.stream.Collectors;

public class OrderApplication {
    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>();
            orders.add(new Order ("1/2019", "Iron", 1.0));
            orders.add(new Order("2/2019", "Cutlery", 6.0));
            orders.add(new Order("3/2019", "Chair", 2.0));
            orders.add(new Order("1/2019", "Iron", 1.0));

        System.out.println(orders.size());
        for(Order order : orders)
            System.out.println(order);
        orders.stream().map(Order::getProductName)
                .filter(a-> a.startsWith("I"))
                .forEach(b-> System.out.println("Product name starting with I: " + b));

        orders.remove(new Order("1/2019", "Iron", 1.0));
        System.out.println(orders.size());

        for(Order order : orders)
            System.out.println(order.getProductName());
        }





    }

