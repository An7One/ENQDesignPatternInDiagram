package com.an7one.part02.ch03templatemethod.example;

public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    // the template method
    public final void display() {
        open();

        for (int i = 0; i < 5; ++i) {
            print();
        }

        close();
    }
}
