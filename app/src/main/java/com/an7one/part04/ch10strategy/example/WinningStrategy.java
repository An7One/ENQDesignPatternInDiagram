package com.an7one.part04.ch10strategy.example;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private final Random random;
    private boolean won;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won)
            prevHand = Hand.getHand(random.nextInt(3));

        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
