package com.zemoso.assignment7.assignment7_1;

public class Hamster extends Rodent{

    public Hamster() {
        System.out.println("This is a Hamster.");
    }

    @Override
    public void eat() {
        System.out.println("Hamster is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster is sleeping.");
    }
}
