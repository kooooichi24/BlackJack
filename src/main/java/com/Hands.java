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
        int aceCount = 0;

        for (Card card : hands) {
            if (card.getRank().equals("A")) {
                aceCount++;
            } else {
                totalScore += card.getValue();
            }
        }

        while (aceCount > 0) {
            if (totalScore + 11 > 21) {
                totalScore += 1;
            } else {
                totalScore += 11;
            }
            aceCount--;
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
