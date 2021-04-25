package com.an7one.part02.ch03templatemethod.example;

public class App {
    
    public static void main(String[] args) {
        AbstractDisplay chDisplay = new CharDisplay('H');
        AbstractDisplay strDisplay = new StringDisplay("Hello World");
        AbstractDisplay chineseDisplay = new StringDisplay("你好 世界");

        chDisplay.display();
        strDisplay.display();
        chineseDisplay.display();
    }
}
