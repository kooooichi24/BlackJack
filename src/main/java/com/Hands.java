package main.java.com;

import java.util.ArrayList;
import java.util.List;

public class Hands {
    private List<Card> hands;

    public Hands() {
        hands = new ArrayList<>();
    }

    public void addCard(Card card) {
        hands.add(card);
    }

    public int getTotalScore() {
        int totalScore = 0;
        for (Card card : hands) {
            totalScore += card.getValue();
        }
        return totalScore;
    }

    public boolean isBust() {
        return 21 < getTotalScore();
    }

    @Override
    public String toString() {
        return hands.toString();
    }
}
