package com.an7one.part03.ch05singleton.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Start.");
        
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("singleton1 and singleton2 is the same: " + (singleton1 == singleton2));

        System.out.println("End.");
    }
}
