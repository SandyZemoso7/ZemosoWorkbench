package com.zemoso.assignment7.assignment7_5;

public class DerivedOuterClass {
    public class DerivedInnerClass extends OuterClass.InnerClass {
        private String derivedInnerVar;

        public DerivedInnerClass(String arg1, String arg2) {
            new OuterClass().super(arg1);
            derivedInnerVar = arg2;
        }

        @Override
        public void display() {
            System.out.println("Derived Inner Variable: " + derivedInnerVar);
        }
    }
}
