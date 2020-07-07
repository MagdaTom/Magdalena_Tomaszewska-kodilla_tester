package com.kodilla.collections.adv.immutable.special.homework;


public class BookApplication {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

        Book book1 = bookManager.createBook("A Girl Like I", "Anita Loos");
        Book book2 = bookManager.createBook("Little Women", "Louisa May Alcott");
        Book book3 = bookManager.createBook("Little Women", "Louisa May Alcott");

        System.out.println(book1 == book2);
        System.out.println(book1 == book3);
        System.out.println(book2 == book3);
    }
}
