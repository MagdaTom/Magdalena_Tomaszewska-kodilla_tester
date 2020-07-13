package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("546"));
        Order order1 = new Order("546");
        //when
        Order getOrder = warehouse.getOrder("546");
        //then
        assertEquals(order1, getOrder);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("546"));
        Order order1 = new Order("546");
        //when
        Order getOrder = warehouse.getOrder("400");
    }
}