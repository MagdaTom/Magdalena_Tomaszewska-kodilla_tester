package com.kodilla.rest;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaExitCodeApplication {

    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(KodillaExitCodeApplication.class, args)));
    }

}
