package com.abdulhakeem;

public class ScopeCheck {
    public int publicVar = 0;
    private final int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + " privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2;
        for(int i=0; i<13; i++) {
            System.out.println(i + " * 2 = " + i * privateVar);
        }
    }
    public class InnerClass {
        private final int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);
        }

        public int getPrivateVar() {
            return privateVar;
        }

        public void timesThree() {
            int privateVar = 3;
            for(int i=0; i<13; i++) {
                System.out.println(i + " * 3 = " + i * privateVar);
            }
        }
    }
    public void fourTimes() {
        int privateVar = 4;
        for(int i=0; i<13; i++) {
            System.out.println(i + " * 4 = " + i * privateVar);
        }
    }

}
