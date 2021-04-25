package com.an7one.part02.ch04factorymethod.example;

import com.an7one.part02.ch04factorymethod.example.framework.Factory;
import com.an7one.part02.ch04factorymethod.example.framework.Product;
import com.an7one.part02.ch04factorymethod.example.idcard.IDCardFactory;

public class App {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("user1");
        Product card2 = factory.create("user2");
        Product card3 = factory.create("user3");

        card1.use();
        card2.use();
        card3.use();
    }
}
