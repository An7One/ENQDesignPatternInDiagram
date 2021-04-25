package com.an7one.part03.ch06prototype.example.framework;

public interface Product extends Cloneable {
    void use(String title);

    Product createClone();
}
