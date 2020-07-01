package com.kodilla.collections.adv.immutable.homework;

public final class Task {

    private final String title;
    private final int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}
