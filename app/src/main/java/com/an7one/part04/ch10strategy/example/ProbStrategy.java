package com.an7one.part04.ch10strategy.example;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private final Random random;
    private int prevHandValue;
    private int curHandValue;
    private final int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1},
    };

    public ProbStrategy(int seed) {
        this.random = new Random(seed);
        this.prevHandValue = 0;
        this.curHandValue = 0;
    }

    @Override
    public Hand nextHand() {
        return null;
    }

    @Override
    public void study(boolean win) {

    }
}
