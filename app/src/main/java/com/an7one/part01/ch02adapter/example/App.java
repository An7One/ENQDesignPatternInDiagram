package com.an7one.part01.ch02adapter.example;

import com.an7one.part01.ch02adapter.example.withdelegate.PrintBannerWithDelegate;
import com.an7one.part01.ch02adapter.example.withinheritance.PrintBannerWithInheritance;
import com.an7one.part01.ch02adapter.example.withinheritance.PrintWithInheritance;

public class App {

    public static void main(String[] args) {
        /*
         * Adapter Design Pattern with inheritance
         * to the `main` method, `Banner`, `showWithParentheses()`, `showWithAsterisk` are completely hidden
         */
        PrintWithInheritance printWithInheritance = new PrintBannerWithInheritance("Hello World");
        printWithInheritance.printWeak();
        printWithInheritance.printStrong();


        /*
         * Adapter Design Pattern with Delegate
         * to the `main` method, `Banner`, `showWithParentheses()`, `showWithAsterisk` are completely hidden
         */
        PrintBannerWithDelegate printWithDelegate = new PrintBannerWithDelegate("Print with Delegate");
        printWithDelegate.printWeak();
        printWithDelegate.printStrong();
    }
}
