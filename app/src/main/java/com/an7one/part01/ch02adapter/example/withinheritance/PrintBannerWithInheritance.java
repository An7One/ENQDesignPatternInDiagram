package com.an7one.part01.ch02adapter.example.withinheritance;

import com.an7one.part01.ch02adapter.example.Banner;

/**
 * Class Adapter Design Pattern, based on inheritance
 */
public class PrintBannerWithInheritance extends Banner implements PrintWithInheritance {

    public PrintBannerWithInheritance(String title) {
        super(title);
    }

    @Override
    public void printWeak() {
        showWithParentheses();
    }

    @Override
    public void printStrong() {
        showWithAsterisk();
    }
}
