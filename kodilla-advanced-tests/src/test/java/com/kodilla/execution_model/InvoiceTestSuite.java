package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item milk = new Item("milk", 2.50);
    Item coffee = new Item("coffee", 7.00);
    Item chocolate = new Item("chocolate", 10.25);

    @Test
    public void shouldAddItemsToInvoice() {
        //when
        int numberOfItems = invoice.getSize();
        //then
        assertEquals(3, numberOfItems);

    }

    @Test
    public void shouldGetExistingItem() {
        //when
        Item result = invoice.getItem(1);
        //then
        assertEquals(coffee,result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        //when
        Item result = invoice.getItem(6);
        //then
        assertNull(result);

    }
    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        //when
        Item result = invoice.getItem(-6);
        //then
        assertNull(result);
    }
    @Test
    public void shouldClearInvoice() {
        //when
        invoice.clear();
        //then
        assertEquals(0, invoice.getSize());
    }
    @BeforeEach
    public void initialiseInvoice(){
        invoice.addItem(milk);
        invoice.addItem(coffee);
        invoice.addItem(chocolate);
    }

    @AfterEach
    public void resetValues(){
        System.out.println("Resetting values...");
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