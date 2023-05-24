package com.zemoso.assignment7.assignment7_3;

public class ImplClass extends ConcreteClass implements CombinedInterface{
    @Override
    public void newMethod() {
        System.out.println("newMethod Implementation of CombinedInterface");
    }

    @Override
    public void method1() {
        System.out.println("method1 Implementation of interfaces");
    }

    @Override
    public void method2() {
        System.out.println("method2 Implementation of interface");
    }
}
