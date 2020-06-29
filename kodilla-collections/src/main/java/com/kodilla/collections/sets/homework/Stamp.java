package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private String size;
    private boolean isStamped;


    public Stamp(String name, String size, boolean isStamped) {
        this.name = name;
        this.size = size;
        this.isStamped = isStamped;
    }


   public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public boolean isStamped() {
    return isStamped;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", isStamped=" + isStamped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return isStamped == stamp.isStamped &&
                Objects.equals(name, stamp.name) &&
                Objects.equals(size, stamp.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, isStamped);
    }
}
