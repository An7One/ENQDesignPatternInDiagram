package com.an7one.part03.ch07builder.example;

public class TextBuilder extends Builder {
    private final StringBuffer buffer;

    public TextBuilder() {
        this.buffer = new StringBuffer();
    }

    @Override
    public void makeTitle(String title) {
        buffer.append("==============================")
                .append("开括号").append(title).append("闭括号")
                .append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("特殊").append(str).append("\n")
                .append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append("  .").append(item).append("\n");
        }

        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("==============================");
    }

    public String getResult() {
        return buffer.toString();
    }
}
