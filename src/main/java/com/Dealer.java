package main.java.com;

import java.util.Scanner;

public class Dealer {
    private Hands hands;

    public Dealer() {
        hands = new Hands();
    }

    public int getTotalScore() {
        return hands.getTotalScore();
    }

    public void hit(Card card) {
        hands.addCard(card);
    }

    public boolean isBust() {
        return hands.isBust();
    }

    public void showHands() {
        System.out.println(hands);
    }
}
