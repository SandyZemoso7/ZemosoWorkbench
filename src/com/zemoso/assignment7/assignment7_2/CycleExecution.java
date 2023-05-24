package com.zemoso.assignment7.assignment7_2;

public class CycleExecution {
    public static void main(String[] args) {
        // Create instances of each type of cycle
        Unicycle unicycle = new Unicycle("Unicycle");
        Bicycle bicycle = new Bicycle("Bicycle");
        TriCycle tricycle = new TriCycle("TriCycle");

        // Upcast instances to an array of Cycle
        Cycle[] cycles = { unicycle, bicycle, tricycle };

        // Call balance() on each element in the array
        for (Cycle cycle : cycles) {
            if (cycle instanceof Unicycle) {
                ((Unicycle) cycle).balance();
            } else if (cycle instanceof Bicycle) {
                ((Bicycle) cycle).balance();
            } else if (cycle instanceof TriCycle) {
                System.out.println("Tricycle has better balance due to stable. Hence, no need of balancing");
            }
        }
    }
}
