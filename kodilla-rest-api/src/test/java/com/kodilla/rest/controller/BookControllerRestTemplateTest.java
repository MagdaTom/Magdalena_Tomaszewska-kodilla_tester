package com.kodilla.rest.controller;

import com.google.gson.Gson;
import com.kodilla.rest.KodillaRestApiApplication;
import com.kodilla.rest.domain.BookDto;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class BookControllerRestTemplateTest {

    Gson gson = new Gson();
    BookDto book = new BookDto("title1", "author1");
    BookDto book1 = new BookDto("title2", "author2");
    List<BookDto> booksList = new ArrayList<>();

    @Autowired
    private RestTemplate restTemplate;

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
    public void testGet() {
        Assertions.assertNotNull(restTemplate);
        ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/books", HttpMethod.GET, null, String.class);
        System.out.println(response);
        Assertions.assertEquals(200, response.getStatusCodeValue());
        Assertions.assertNotNull(response.getBody());
    }

    @Test
    public void testPost() {
        Assertions.assertNotNull(restTemplate);
        booksList.add(book);
        String request = gson.toJson(book);
        HttpEntity<String> entity = createRequestEntity(request, "application/json");
        ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/books", HttpMethod.POST, entity, String.class);
        System.out.println(response);
        Assertions.assertEquals(200, response.getStatusCodeValue());
    }

    private HttpEntity<String> createRequestEntity(String request, String contentType) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.valueOf(contentType));
        return new HttpEntity<>(request, httpHeaders);
    }

    @Test
    public void integrationTest() {
        booksList.add(book1);
        String request = gson.toJson(book1);
        HttpEntity<String> entity = createRequestEntity(request, "application/json");
        ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/books", HttpMethod.POST, entity, String.class);
        System.out.println(response);
        Assertions.assertEquals(200, response.getStatusCodeValue());
        ResponseEntity<String> response2 = restTemplate.exchange("http://localhost:8080/books", HttpMethod.GET, null, String.class);
        System.out.println(response2);
        Assertions.assertEquals(200, response2.getStatusCodeValue());
        Assertions.assertNotNull(response2.getBody());
    }

    @Test
    public void testDelete() {
        BookDto book2 = new BookDto("title3", "author3");
        BookDto book3 = new BookDto("title4", "author4");
        booksList.add(book2);
        booksList.add(book3);
        booksList.remove(book2);
        String request = gson.toJson(book2);
        String request2 = gson.toJson(book3);
        String request3 = gson.toJson(book2);
        HttpEntity<String> entity = createRequestEntity(request, "application/json");
        HttpEntity<String> entity1 = createRequestEntity(request2, "application/json");
        HttpEntity<String> entity3 = createRequestEntity(request3, "application/json");
        ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/books", HttpMethod.POST, entity, String.class);
        System.out.println(response);
        Assertions.assertEquals(200, response.getStatusCodeValue());
        ResponseEntity<String> response2 = restTemplate.exchange("http://localhost:8080/books", HttpMethod.POST, entity1, String.class);
        System.out.println(response2);
        Assertions.assertEquals(200, response2.getStatusCodeValue());
        ResponseEntity<String> response3 = restTemplate.exchange("http://localhost:8080/books", HttpMethod.DELETE, entity3, String.class);
        Assertions.assertEquals(200, response3.getStatusCodeValue());
    }

    @AfterAll
    public static void exit(){
        KodillaRestApiApplication.stop();
    }

}
