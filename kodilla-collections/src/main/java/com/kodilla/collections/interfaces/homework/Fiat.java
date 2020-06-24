package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car{
    private int speed;

    public Fiat(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed(){
        speed += 60;
        System.out.println("Fiat increased its speed to " + speed + " km/h");
    }

    @Override
    public void decreaseSpeed() {
        if(speed <= 0){
            return;
        }
        speed -= DECREASE;
        System.out.println("Fiat decreased its speed to " + speed + " km/h");
    }
}
