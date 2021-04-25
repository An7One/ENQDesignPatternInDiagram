package com.an7one.part03.ch08abstractfactory.example.listfactory;

import com.an7one.part03.ch08abstractfactory.example.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
