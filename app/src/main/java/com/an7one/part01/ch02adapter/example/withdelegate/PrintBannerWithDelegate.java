package com.an7one.part01.ch02adapter.example.withdelegate;

import com.an7one.part01.ch02adapter.example.Banner;

public class PrintBannerWithDelegate extends PrintWithDelegate {
    private final Banner banner;

    public PrintBannerWithDelegate(String title) {
        this.banner = new Banner(title);
    }

    @Override
    public void printWeak() {
        banner.showWithParentheses();
    }

    @Override
    public void printStrong() {
        banner.showWithAsterisk();
    }
}
