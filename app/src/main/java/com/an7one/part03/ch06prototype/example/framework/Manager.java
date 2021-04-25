package com.an7one.part03.ch06prototype.example.framework;

import java.util.HashMap;

public class Manager {
    private final HashMap<String, Product> showcase;

    public Manager() {
        this.showcase = new HashMap<>();
    }

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String prototypeName) {
        Product product = (Product) showcase.get(prototypeName);
        return product.createClone();
    }
}
