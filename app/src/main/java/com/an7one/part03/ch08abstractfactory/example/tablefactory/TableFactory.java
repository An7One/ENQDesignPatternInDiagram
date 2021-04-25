package com.an7one.part03.ch08abstractfactory.example.tablefactory;

import com.an7one.part03.ch08abstractfactory.example.factory.Factory;
import com.an7one.part03.ch08abstractfactory.example.factory.Link;
import com.an7one.part03.ch08abstractfactory.example.factory.Page;
import com.an7one.part03.ch08abstractfactory.example.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return null;
    }

    @Override
    public Tray createTray(String caption) {
        return null;
    }

    @Override
    public Page createPage(String title, String author) {
        return null;
    }
}
