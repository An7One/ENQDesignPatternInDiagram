package com.an7one.part03.ch08abstractfactory.example.listfactory;

import com.an7one.part01.ch01iterator.example.Iterator;
import com.an7one.part03.ch08abstractfactory.example.factory.Item;
import com.an7one.part03.ch08abstractfactory.example.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();

        builder.append("<html><head><title>").append(title).append("</title></head>\n")
                .append("<body>\n")
                .append("<h1>").append(title).append("</h1>\n")
                .append("<ul>\n");

        Iterator iter = (Iterator) content.iterator();

        while (iter.hasNext()) {
            Item item = (Item) iter.next();
            builder.append(item.makeHTML());
        }

        builder.append("</ul>\n")
                .append("<hr><adderss>").append(author).append("</address")
                .append("</body></html>\n");

        return builder.toString();
    }
}
