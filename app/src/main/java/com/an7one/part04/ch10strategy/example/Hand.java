package com.an7one.part04.ch10strategy.example;

public class Hand {
    public static final int HAND_VALUE_STONE = 0;
    public static final int HAND_VALUE_SCISSOR = 1;
    public static final int HAND_VALUE_CLOTH = 2;

    public static final Hand[] hands = {
            new Hand(HAND_VALUE_STONE),
            new Hand(HAND_VALUE_SCISSOR),
            new Hand(HAND_VALUE_CLOTH),
    };

    private static final String[] names = {
            "Stone", "Scissor", "Cloth"
    };

    private final int handValue;

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this == hand)
            return 0;
        else if ((this.handValue + 1) % 3 == hand.handValue)
            return 1;
        else
            return -1;
    }

    public String toString() {
        return names[handValue];
    }
}
