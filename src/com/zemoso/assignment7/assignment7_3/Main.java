package com.zemoso.assignment7.assignment7_3;

public class Main {
    public static void methodA(Interface1 obj) {
        obj.method1();
        obj.method2();
    }

    public static void methodB(Interface2 obj) {
        obj.method1();
        obj.method2();
    }

    public static void methodC(Interface3 obj) {
        obj.method1();
        obj.method2();
    }

    public static void methodD(CombinedInterface obj) {
        obj.newMethod();
        obj.method1();
        obj.method2();
    }

    public static void main(String[] args) {
        ImplClass implObj = new ImplClass();

        methodA(implObj);
        methodB(implObj);
        methodC(implObj);
        methodD(implObj);
    }
}
