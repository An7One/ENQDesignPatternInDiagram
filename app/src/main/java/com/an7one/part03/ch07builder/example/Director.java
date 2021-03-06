package com.an7one.part03.ch07builder.example;

/**
 * Director does not care about whether it is `TextBuilder` or `HTMLBuilder`
 */
public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("From the morning to the afternoon");
        builder.makeItems(new String[]{
                "Good morning",
                "Good afternoon",
        });

        builder.makeString("Evening");
        builder.makeItems(new String[]{
                "Good evening",
                "Good night",
                "Goodbye"
        });

        builder.close();
    }
}
