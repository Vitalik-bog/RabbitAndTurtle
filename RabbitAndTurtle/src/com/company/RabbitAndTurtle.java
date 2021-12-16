package com.company;

public class RabbitAndTurtle {
    public void starRace() throws InterruptedException{
        AnimalThread rabbit = new AnimalThread("Кролик",1);
        AnimalThread turtle = new AnimalThread("Черапашка",10);
        rabbit.start();
        turtle.start();
    }
}
