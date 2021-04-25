package com.an7one.part03.ch08abstractfactory.example.listfactory;

import com.an7one.part03.ch08abstractfactory.example.factory.Factory;
import com.an7one.part03.ch08abstractfactory.example.factory.Link;
import com.an7one.part03.ch08abstractfactory.example.factory.Page;
import com.an7one.part03.ch08abstractfactory.example.factory.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
