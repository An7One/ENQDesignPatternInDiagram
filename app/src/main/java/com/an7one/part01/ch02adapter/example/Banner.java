package com.an7one.part01.ch02adapter.example;

public class Banner {
    private final String title;

    public Banner(String title) {
        this.title = title;
    }

    public void showWithParentheses() {
        System.out.println("(" + title + ")");
    }

    public void showWithAsterisk() {
        System.out.println("*" + title + "*");
    }
}
