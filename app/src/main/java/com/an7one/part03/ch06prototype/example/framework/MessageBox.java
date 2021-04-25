package com.an7one.part03.ch06prototype.example.framework;

import java.nio.charset.StandardCharsets;

public class MessageBox implements Product {
    private final char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String title) {
        final int LEN = title.getBytes(StandardCharsets.UTF_8).length;
        for (int i = 0; i < LEN + 4; ++i) {
            System.out.print(decoChar);
        }

        System.out.println();
        System.out.println(decoChar + " " + title + " " + decoChar);

        for (int i = 0; i < LEN + 4; ++i) {
            System.out.print(decoChar);
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
