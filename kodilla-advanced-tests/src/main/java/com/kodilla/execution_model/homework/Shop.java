package com.kodilla.execution_model.homework;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        if (Optional.ofNullable(order).isPresent()) {
            if (order.getValue() <= 0) {
                return;
            }
            orders.add(order);
        }
    }

    public Set<Order> returnOrdersWithinGivenRangeOfDates(LocalDate dateFrom, LocalDate dateTo) {
        return orders.stream()
                .filter(a -> a.getDate().isAfter(dateFrom) && a.getDate().isBefore(dateTo))
                .collect(Collectors.toSet());
    }

    public Set<Order> returnOrdersWithinGivenRangeOfValues(double minValue, double maxValue) {
        return orders.stream()
                .filter(a -> a.getValue() >= minValue && a.getValue() <= maxValue)
                .collect(Collectors.toSet());
    }

    public int returnNumberOfOrders() {
        return orders.size();
    }

    public double returnOrdersSum() {
        return orders.stream()
                .map(Order::getValue)
                .mapToDouble(a -> a)
                .sum();
    }
}

