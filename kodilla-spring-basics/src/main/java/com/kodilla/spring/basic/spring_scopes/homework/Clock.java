package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    LocalTime time;

    public Clock() {
        this.time = LocalTime.now();
        System.out.println(time);
    }
}
