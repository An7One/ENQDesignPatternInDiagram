package com.an7one.part03.ch07builder.example;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String fileName = htmlBuilder.getResult();
            System.out.println(fileName + " is completed");
        } else {
            usage();
            System.exit(0);
        }
    }

    private static void usage() {
        System.out.println("Usage: java Main plain");
        System.out.println("Usage: java Main html");
    }
}
