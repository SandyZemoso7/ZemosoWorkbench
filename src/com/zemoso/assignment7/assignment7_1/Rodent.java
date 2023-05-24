package com.zemoso.assignment7.assignment7_1;

abstract class Rodent {
    public Rodent() {
        System.out.println("This is a Rodent.");
    }

    public abstract void eat();

    public abstract void sleep();

    public void run() {
        System.out.println("Rodent is running.");
    }
}
