package com.an7one.part04.ch09bridge.example;

import java.nio.charset.StandardCharsets;

public class StringDisplayImpl extends DisplayImpl {
    private final String content;
    private final int width;

    public StringDisplayImpl(String content) {
        this.content = content;
        this.width = content.getBytes(StandardCharsets.UTF_8).length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + content + "|");
    }

    @Override
    public void rawClose() {
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
