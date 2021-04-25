package com.an7one.part03.ch08abstractfactory.example.factory;

public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
