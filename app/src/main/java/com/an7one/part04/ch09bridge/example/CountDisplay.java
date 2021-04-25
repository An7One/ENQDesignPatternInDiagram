package com.an7one.part04.ch09bridge.example;

public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    // the newly added "类的功能层次结构",
    // realized by `open`, `print`, `close` inherited
    public void multiDisplay(int times) {
        open();

        for (int i = 0; i < times; ++i) {
            print();
        }

        close();
    }
}
