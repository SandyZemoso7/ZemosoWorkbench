package com.zemoso.assignment7.assignment7_2;

class Bicycle extends Cycle{
    public Bicycle(String name) {
        super(name);
    }

    public void balance() {
        System.out.println("Balancing on " + name);
    }
}
