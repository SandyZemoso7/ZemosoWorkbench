package com.zemoso.assignment7.assignment7_1;

public class Gerbil extends Rodent{

    public Gerbil() {
        System.out.println("This is a Gerbil.");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Gerbil is sleeping.");
    }
}
