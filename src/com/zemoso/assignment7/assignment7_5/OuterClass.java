package com.zemoso.assignment7.assignment7_5;

public class OuterClass {
    private String outerVar;

    public OuterClass() {
        outerVar = "Outer";
    }

    public class InnerClass {
        private String innerVar;

        public InnerClass(String arg) {
            innerVar = arg;
        }

        public void display() {
            System.out.println("Inner Variable: " + innerVar);
        }
    }
}
