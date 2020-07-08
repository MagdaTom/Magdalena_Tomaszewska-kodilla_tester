package com.kodilla.stream.homework;


import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private String name;
    private LocalDate opened;
    private LocalDate deadline;

    public Task(String name, LocalDate opened, LocalDate deadline) {
        this.name = name;
        this.opened = opened;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public LocalDate getOpened() {
        return opened;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) &&
                Objects.equals(opened, task.opened) &&
                Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, opened, deadline);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", opened=" + opened +
                ", deadline=" + deadline +
                '}';
    }
}
