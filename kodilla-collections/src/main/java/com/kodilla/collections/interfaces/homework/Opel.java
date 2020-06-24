package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    private int speed;

    public Opel(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 70;
        System.out.println("Opel increased its speed to " + speed + " km/h");
    }

    @Override
    public void decreaseSpeed() {
        if(speed <= 0){
            return;
        }
        speed -= DECREASE;
        System.out.println("Opel decreased its speed to " + speed + " km/h");
    }
}
