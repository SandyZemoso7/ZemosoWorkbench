package com.zemoso.assignment7.assignment7_2;

class Unicycle extends Cycle{

    public Unicycle(String name) {
        super(name);
    }

    public void balance() {
        System.out.println("Balancing on " + name);
    }
}
