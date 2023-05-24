package com.zemoso.assignment7.assignment7_4;

import com.zemoso.assignment7.assignment7_4.factories.BicycleFactory;
import com.zemoso.assignment7.assignment7_4.factories.TricycleFactory;
import com.zemoso.assignment7.assignment7_4.factories.UnicycleFactory;
import com.zemoso.assignment7.assignment7_4.service.Cycle;
import com.zemoso.assignment7.assignment7_4.service.CycleFactory;

public class CycleFactoryExample {
    public static void main(String[] args) {

        CycleFactory unicycleFactory = new UnicycleFactory();
        Cycle unicycle = unicycleFactory.createCycle();
        unicycle.ride();

        CycleFactory bicycleFactory = new BicycleFactory();
        Cycle bicycle = bicycleFactory.createCycle();
        bicycle.ride();

        CycleFactory tricycleFactory = new TricycleFactory();
        Cycle tricycle = tricycleFactory.createCycle();
        tricycle.ride();
    }
}
