package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.time.LocalTime;
import java.util.Objects;

@Component
@Scope("prototype")
public class Clock {

    LocalTime time;

    public Clock() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.time = LocalTime.now();
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clock clock = (Clock) o;
        return Objects.equals(time, clock.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time);
    }
}
