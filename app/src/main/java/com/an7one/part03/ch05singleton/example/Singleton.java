package com.an7one.part03.ch05singleton.example;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("One instance has been generated");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
