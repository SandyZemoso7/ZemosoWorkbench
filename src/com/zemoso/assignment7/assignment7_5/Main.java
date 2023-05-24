package com.zemoso.assignment7.assignment7_5;

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass("Argument");
        inner.display();

        DerivedOuterClass derivedOuter = new DerivedOuterClass();
        DerivedOuterClass.DerivedInnerClass derivedInner = derivedOuter.new DerivedInnerClass("Argument 1", "Argument 2");
        derivedInner.display();
    }
}
