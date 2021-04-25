package com.an7one.part04.ch10strategy.example;

public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
