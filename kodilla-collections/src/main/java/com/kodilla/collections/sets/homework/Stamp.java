package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double length, width;
    private boolean isStamped;


    public Stamp(String name, double length, double width, boolean isStamped) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.isStamped = isStamped;
    }


    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", isStamped=" + isStamped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.length, length) == 0 &&
                Double.compare(stamp.width, width) == 0 &&
                isStamped == stamp.isStamped &&
                Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, width, isStamped);
    }
}
