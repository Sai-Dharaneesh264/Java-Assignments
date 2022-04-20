package com.java.Assignments.Assignment5;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.print();
        data.printLocalVariables();
        Singleton singleton = Singleton.staticMethod("Hello");
        singleton.printString();
    }
}
