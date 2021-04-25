package com.an7one.part04.ch09bridge.example;

public class App {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello World from Display d1"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello World from CountDisplay d2"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello World from CountDisplay d3"));

        d1.display();
        d2.display();
        d3.display();

        // !!!
        d3.multiDisplay(5);
    }
}
