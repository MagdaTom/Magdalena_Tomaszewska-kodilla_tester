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
        SpringApplication.run(KodillaRestApiApplication.class);
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
    public void delete() {
        booksList.remove(book);
        String request = gson.toJson(book);
        HttpEntity<String> entity = createRequestEntity(request, "application/json");
        ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/books", HttpMethod.DELETE, entity, String.class);
        System.out.println(response);
        Assertions.assertEquals(200, response.getStatusCodeValue());
        ResponseEntity<String> response2 = restTemplate.exchange("http://localhost:8080/books", HttpMethod.GET, null, String.class);
        System.out.println(response2);
        Assertions.assertEquals(200, response2.getStatusCodeValue());
        Assertions.assertNotNull(response2.getBody());
    }
}

//    @AfterAll
//    public static void exit(){
//        SpringApplication.run(KodillaRestApiApplication.class).close();
//    }


