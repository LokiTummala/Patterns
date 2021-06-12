package com.example.DesignPatterns;

public class WoodenDuck extends Duck  implements Quackable, Flyable{
    @Override
    public void display() {
        System.out.println("I am Wooden Duck");
    }
    @Override
    public void quack() {
        System.out.println("No Quacking");
    }
    @Override
    public void fly() {
        System.out.println("No Flying");
    }
}
