package com.an7one.part03.ch08abstractfactory.example;

import com.an7one.part03.ch08abstractfactory.example.factory.Factory;
import com.an7one.part03.ch08abstractfactory.example.factory.Link;

public class App {
    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listFactory.ListFactory");
            System.out.println("Example 2: java Main tableFactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link urlGoogle = factory.createLink("Google", "https://www.google.com");
        Link urlBaidu = factory.createLink("Baidu", "https://www.baidu.com");

        // to be continued...
        // P81
    }
}
