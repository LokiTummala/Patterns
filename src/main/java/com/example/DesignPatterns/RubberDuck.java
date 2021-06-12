package com.example.DesignPatterns;

public class RubberDuck extends Duck implements Quackable, Flyable{
    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
    @Override
    public void quack() {
        System.out.println("Squeaking");
    }
    @Override
    public void fly() {
        System.out.println("No Flying");
    }
}
