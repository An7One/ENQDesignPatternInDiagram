package com.an7one.part03.ch06prototype.example.framework;

import java.nio.charset.StandardCharsets;

public class UnderlinePen implements Product {
    private final char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String title) {
        final int LEN = title.getBytes(StandardCharsets.UTF_8).length;
        System.out.println("\"" + title + "\"");
        System.out.println(" ");
        for (int i = 0; i < LEN + 4; ++i) {
            System.out.print(ulChar);
        }

        System.out.println();
    }

    @Override
    public Product createClone() {
        Product product = null;

        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        return product;
    }
}
