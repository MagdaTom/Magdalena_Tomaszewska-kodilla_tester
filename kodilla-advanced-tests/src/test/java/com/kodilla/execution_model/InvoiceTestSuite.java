package com.kodilla.execution_model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {


    @Test
    public void shouldAddItemsToInvoice() {
        //given
        Invoice invoice = new Invoice();
        Item milk = new Item("milk", 2.50);
        Item coffee = new Item("coffee", 7.00);
        Item chocolate = new Item("chocolate", 10.25);
        invoice.addItem(milk);
        invoice.addItem(coffee);
        invoice.addItem(chocolate);
        //when
        int numberOfItems = invoice.getSize();
        //then
        assertEquals(3, numberOfItems);

    }

    @Test
    public void shouldGetExistingItem() {
        //given
        Invoice invoice = new Invoice();
        Item milk = new Item("milk", 2.50);
        Item coffee = new Item("coffee", 7.00);
        Item chocolate = new Item("chocolate", 10.25);
        invoice.addItem(milk);
        invoice.addItem(coffee);
        invoice.addItem(chocolate);
        //when
        Item result = invoice.getItem(1);
        //then
        assertEquals(coffee,result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        //given
        Invoice invoice = new Invoice();
        Item milk = new Item("milk", 2.50);
        Item coffee = new Item("coffee", 7.00);
        Item chocolate = new Item("chocolate", 10.25);
        invoice.addItem(milk);
        invoice.addItem(coffee);
        invoice.addItem(chocolate);
        //when
        Item result = invoice.getItem(6);
        //then
        assertNull(result);

    }
    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        //given
        Invoice invoice = new Invoice();
        Item milk = new Item("milk", 2.50);
        Item coffee = new Item("coffee", 7.00);
        Item chocolate = new Item("chocolate", 10.25);
        invoice.addItem(milk);
        invoice.addItem(coffee);
        invoice.addItem(chocolate);
        //when
        Item result = invoice.getItem(-6);
        //then
        assertNull(result);
    }
    @Test
    public void shouldClearInvoice() {

        //given
        Invoice invoice = new Invoice();
        Item milk = new Item("milk", 2.50);
        Item coffee = new Item("coffee", 7.00);
        Item chocolate = new Item("chocolate", 10.25);
        invoice.addItem(milk);
        invoice.addItem(coffee);
        invoice.addItem(chocolate);
        //when
        invoice.clear();
        //then
        assertEquals(0, invoice.getSize());
    }
}