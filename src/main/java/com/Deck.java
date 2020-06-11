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

    public List<Card> getDeck() {
        return deck;
    }

    // 最後の要素を削除 & 返す
    public Card hit() {
        Card hitCard = deck.remove(deck.size()-1); // 最後の要素を指定したいけど、引数にマイナス1ってダサいよね
        return hitCard;
    }
}
