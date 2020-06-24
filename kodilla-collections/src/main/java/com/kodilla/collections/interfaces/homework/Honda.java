package com.kodilla.collections.interfaces.homework;


public class Honda implements Car{
    private int speed;


    public Honda(int speed){
        this.speed = speed;
    }


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 50;
        System.out.println("Honda increased its speed to " + speed + " km/h");
    }

    @Override
    public void decreaseSpeed() {
        if(speed <= 0){
            return;
        }
        speed -= DECREASE;
        System.out.println("Honda decreased its speed to " + speed + " km/h");
    }
}
