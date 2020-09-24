package com.kodilla.rest.controller;

import com.kodilla.rest.KodillaRestApiApplication;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class BookControllerTestSuite {

    BookService bookServiceMock = mock(BookService.class);
    BookController bookController = new BookController(bookServiceMock);
    List<BookDto> booksList = new ArrayList<>();

    @BeforeAll
    public static void init() {
        KodillaRestApiApplication.main(new String[0]);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldFetchBooks(){
        //given
        booksList.add(new BookDto("Title1", "Author1"));
        booksList.add(new BookDto("Title2", "Author2"));
        when(bookServiceMock.getBooks()).thenReturn(booksList);
        //when
        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldReturnEmptyListIfnNoBooksWereAdded(){
        //given
        when(bookServiceMock.getBooks()).thenReturn(booksList);
        //when
        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).isEmpty();
    }

    @Test
    public void shouldReturnAddedBooks(){
        //given
        BookDto book1 = mock(BookDto.class);
        BookDto book2 = mock(BookDto.class);
        booksList.add(book1);
        booksList.add(book2);
        when(bookServiceMock.getBooks()).thenReturn(booksList);
        //when
        List<BookDto> result = bookController.getBooks();
        //then
       assertThat(result).contains(book1, book2);
    }
    @AfterAll
    public static void exit(){
        KodillaRestApiApplication.stop();
    }
}