package com.java.Assignments.Assignment5;

public class Singleton {
    String str;

    public static Singleton staticMethod(String s) {
        Singleton singleton = new Singleton();
        singleton.str = s;
        return singleton;
    }

    public void printString() {
        System.out.println("Class member string var " + str);
    }
}
