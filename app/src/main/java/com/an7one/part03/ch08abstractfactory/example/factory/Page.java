package com.an7one.part03.ch08abstractfactory.example.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
    protected final String title;
    protected final String author;
    protected final List<Item> content;

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
        this.content = new ArrayList<>();
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String fileName = title + ".html";
            Writer writer = new FileWriter(fileName);
            writer.write(this.makeHTML());
            writer.close();

            System.out.println(fileName + " is completed.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
