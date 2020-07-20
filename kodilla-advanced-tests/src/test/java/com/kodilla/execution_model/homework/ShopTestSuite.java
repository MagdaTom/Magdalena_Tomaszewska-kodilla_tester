package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(25.0, LocalDate.of(2020, 5, 18), "magda1");
    Order order2 = new Order(135.75, LocalDate.of(2019, 9, 25), "magda2");
    Order order3 = new Order(256.25, LocalDate.of(2020, 1, 7), "magda3");

    @Test
    public void shouldAddOrdersToTheShop() {
        //when
        int numberOfOrders = shop.returnNumberOfOrders();
        //then
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldNotAddOrdersToTheShopIfValueIsNegative() {
        //given
        Order order4 = new Order(-15.00, LocalDate.of(2020, 1, 7), "magda3");
        shop.addOrder(order4);
        //when
        int numberOfOrders = shop.returnNumberOfOrders();
        //then
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldNotAddOrdersToTheShopIfValueIsZero() {
        Order order4 = new Order(0.00, LocalDate.of(2020, 1, 7), "magda3");
        shop.addOrder(order4);

        int numberOfOrders = shop.returnNumberOfOrders();
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldNotAddOrdersToTheShopIfOrderIsNull() {
        Order order4 = null;
        shop.addOrder(order4);

        int numberOfOrders = shop.returnNumberOfOrders();
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldReturnOrdersWithinGivenRangeOfDates() {
        int numberOfOrders = shop.returnOrdersWithinGivenRangeOfDates(LocalDate.of(2020, 01, 01), LocalDate.of(2020, 12, 31)).size();

        assertEquals(2, numberOfOrders);
    }

    @Test
    public void shouldReturnTrueIfNoOrdersFoundWithinGivenRangeOfDatesInShop() {
        boolean numberOfOrders = shop.returnOrdersWithinGivenRangeOfDates(LocalDate.of(2018, 9, 28), LocalDate.of(2019, 9, 04)).isEmpty();

        assertTrue(numberOfOrders);
    }

    @Test
    public void shouldReturnOrdersWithinGivenRangeOfValues() {
        int numberOfOrders = shop.returnOrdersWithinGivenRangeOfValues(0.0, 150).size();

        assertEquals(2, numberOfOrders);
    }

    @Test
    public void shouldReturnTrueIfNoOrdersFoundWithinGivenRangeOfValues() {
        boolean numberOfOrders = shop.returnOrdersWithinGivenRangeOfValues(400, 500).isEmpty();

        assertTrue(numberOfOrders);
    }

    @Test
    public void shouldReturnSumOfOrders(){
        double sumOfOrders = shop.returnOrdersSum();

        assertEquals(417, sumOfOrders);
    }

    @BeforeEach
    public void initialiseShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }
    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}