package com.example.DesignPatterns;

public class ReaHeadDuck extends Duck implements Quackable,Flyable {
    @Override
    public void display() {
        System.out.println("I am Red Head Duck");
    }

    @Override
    public void quack() {
        System.out.println("Quacking");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
