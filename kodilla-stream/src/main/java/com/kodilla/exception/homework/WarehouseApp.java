package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("245"));
        warehouse.addOrder(new Order("356"));
        warehouse.addOrder(new Order("489"));

        try {
            System.out.println(warehouse.getOrder("400"));
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesn't exist");
        }
    }
}
