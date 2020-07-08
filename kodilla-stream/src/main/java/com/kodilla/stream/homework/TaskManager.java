package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


public class TaskManager {
    public static void main(String[] args) {

        List<LocalDate> deadlineNotPassed = TaskRepository.getTasks()
                .stream()
                .filter(d -> d.getDeadline().isAfter(LocalDate.now()))
                .map(de -> de.getDeadline())
                .collect(Collectors.toList());
        System.out.println(deadlineNotPassed);
    }
}
