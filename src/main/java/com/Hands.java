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
            }

            totalScore += card.getValue();
        }

        // エースを11とした場合、差分の10が追加される
        // 差分の10を追加して21を超えない場合はAを11とする
        while (aceCount > 0) {
            if (totalScore + 10 > BLACKJACK_BORDER) {
                totalScore += Card.SPADE_A.getValue();
            } else {
                totalScore += 10;
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
