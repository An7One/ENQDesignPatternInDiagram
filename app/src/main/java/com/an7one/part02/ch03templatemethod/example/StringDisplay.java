package com.an7one.part02.ch03templatemethod.example;

import java.nio.charset.StandardCharsets;

public class StringDisplay extends AbstractDisplay {
    private final String content;
    private final int width;

    public StringDisplay(String content) {
        this.content = content;
        this.width = content.getBytes(StandardCharsets.UTF_8).length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + content + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.println("+");

        for (int i = 0; i < width; ++i) {
            System.out.print("-");
        }

        System.out.println("+");
    }
}
