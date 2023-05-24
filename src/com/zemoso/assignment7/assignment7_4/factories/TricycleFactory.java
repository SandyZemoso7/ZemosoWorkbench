package com.zemoso.assignment7.assignment7_4.factories;

import com.zemoso.assignment7.assignment7_4.Impl.Tricycle;
import com.zemoso.assignment7.assignment7_4.service.Cycle;
import com.zemoso.assignment7.assignment7_4.service.CycleFactory;

public class TricycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Tricycle();
    }
}
