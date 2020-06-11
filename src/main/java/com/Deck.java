package main.java.com;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.shuffle;

public class Deck {
    private List<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        setUp();
    }

    // deckに52枚のカードをセットするメソッド
    // shuffleも追加でするよん
    public void setUp() {
        for (Card card : Card.values()) {
            deck.add(card);
        }
        shuffle(deck);
    }

    public Card hit() {
        return deck.remove(0);
    }
}
