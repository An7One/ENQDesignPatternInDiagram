package com.an7one.part03.ch08abstractfactory.example.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Tray extends Item {
    protected final List<Item> tray;

    public Tray(String caption) {
        super(caption);
        this.tray = new ArrayList<>();
    }

    public void add(Item item) {
        tray.add(item);
    }
}
