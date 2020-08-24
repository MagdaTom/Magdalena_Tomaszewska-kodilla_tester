package com.kodilla.rest.controller;

import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class BookControllerRestTemplateTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void testGet(){
        Assertions.assertNotNull(restTemplate);
        HttpEntity<String> entity = null;
        ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/books", HttpMethod.GET, entity, String.class);
        System.out.println(response);
        Assertions.assertEquals(200, response.getStatusCodeValue());
        Assertions.assertNotNull(response.getBody());
    }

    @Test
    public void testPost(){
        Assertions.assertNotNull(restTemplate);
        Gson gson = new Gson();
        BookDto book = new BookDto("title1", "author1");
        List<BookDto> booksList = new ArrayList<>();
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
    public void testIntegration(){
        Gson gson = new Gson();
        BookDto book = new BookDto("title1", "author1");
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(book);
        String request = gson.toJson(book);
        HttpEntity<String> entity = createRequestEntity(request, "application/json");
        ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/books", HttpMethod.POST, entity, String.class);
        System.out.println(response);
        Assertions.assertEquals(200, response.getStatusCodeValue());
        ResponseEntity<String> response2 = restTemplate.exchange("http://localhost:8080/books", HttpMethod.GET, null, String.class);
        System.out.println(response2);
        Assertions.assertEquals(200, response2.getStatusCodeValue());
        Assertions.assertNotNull(response2.getBody());
    }
}
