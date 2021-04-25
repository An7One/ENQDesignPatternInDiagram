package com.an7one.part03.ch08abstractfactory.example.listfactory;

import com.an7one.part01.ch01iterator.example.Iterator;
import com.an7one.part03.ch08abstractfactory.example.factory.Item;
import com.an7one.part03.ch08abstractfactory.example.factory.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<li>\n");
        builder.append(caption).append("\n");
        builder.append("<ul>\n");

        Iterator iter = (Iterator) tray.iterator();
        while (iter.hasNext()) {
            Item item = (Item) iter.next();
            builder.append(item.makeHTML());
        }

        builder.append("</ul>\n");
        builder.append("</li>\n");
        return builder.toString();
    }
}
