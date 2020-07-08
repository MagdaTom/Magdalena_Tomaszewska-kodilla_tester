package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("buy milk", LocalDate.now(), LocalDate.of(2020, 07, 20)));
        tasks.add(new Task("do the laundry", LocalDate.now(), LocalDate.of(2020, 07, 15)));
        tasks.add(new Task("walk the dog", LocalDate.now(), LocalDate.of(2020, 07, 06)));
        tasks.add(new Task("wash the car", LocalDate.now(), LocalDate.of(2020, 06, 29)));
        return tasks;
    }
}
