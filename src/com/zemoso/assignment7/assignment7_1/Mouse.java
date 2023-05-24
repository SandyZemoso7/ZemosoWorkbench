package com.zemoso.assignment7.assignment7_1;

public class Mouse extends Rodent{

    public Mouse() {
        System.out.println("This is a Mouse.");
    }

    @Override
    public void eat() {
        System.out.println("Mouse is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse is sleeping.");
    }
}
