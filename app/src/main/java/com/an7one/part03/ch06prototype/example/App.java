package com.an7one.part03.ch06prototype.example;

import com.an7one.part03.ch06prototype.example.framework.Manager;
import com.an7one.part03.ch06prototype.example.framework.MessageBox;
import com.an7one.part03.ch06prototype.example.framework.Product;
import com.an7one.part03.ch06prototype.example.framework.UnderlinePen;

public class App {
    public static void main(String[] args) {
        // to prepare
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);

        // to produce
        Product product1 = manager.create("strong message");
        product1.use("Hello World");
        Product product2 = manager.create("warning box");
        product2.use("Hello World");
        Product product3 = manager.create("slash box");
        product3.use("Hello World");
    }
}
