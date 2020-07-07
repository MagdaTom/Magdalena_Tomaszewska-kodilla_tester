package com.kodilla.collections.adv.immutable.special.homework;


import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private List<Book> books = new ArrayList<>();

    public Book createBook(String title, String author) {
        Book book1 = new Book(title, author);
        if(books.contains(book1)){
            System.out.println(book1 + " is a duplicate");
        }
        else{
            books.add(book1);
        }
        return book1;
    }
}

