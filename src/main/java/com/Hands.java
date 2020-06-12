package main.java.com;

import java.util.ArrayList;
import java.util.List;

public class Hands {
    private List<Card> hands;
    private final static int BLACKJACK_BORDER = 21;

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
            if (totalScore + 11 > BLACKJACK_BORDER) {
                totalScore += Card.SPADE_A.getValue();
            } else {
                totalScore += 11;
            }
            aceCount--;
        }

        return totalScore;
    }

    public boolean isBust() {
        return BLACKJACK_BORDER < getTotalScore();
    }

    @Override
    public String toString() {
        return hands.toString();
    }
}
