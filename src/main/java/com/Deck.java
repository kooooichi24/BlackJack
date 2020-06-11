package main.java.com;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        setUp();
    }

    // deckに52枚のカードをセットするメソッド
    public void setUp() {
        // 最初の謎
        // {"♠", "A", 1} の形式で52ペア作成して、Deckクラスに代入したい。。。
        // ひとまずやばいやつで
        deck.add(new Card("♠", "A", 1));
        deck.add(new Card("♠", "2", 2));
        deck.add(new Card("♠", "3", 3));
        deck.add(new Card("♠", "4", 4));
        deck.add(new Card("♠", "5", 5));
        deck.add(new Card("♠", "6", 6));
        deck.add(new Card("♠", "7", 7));
        deck.add(new Card("♠", "8", 8));
        deck.add(new Card("♠", "9", 9));
        deck.add(new Card("♠", "10", 10));
        deck.add(new Card("♠", "J", 10));
        deck.add(new Card("♠", "Q", 10));
        deck.add(new Card("♠", "K", 10));
        deck.add(new Card("❤︎", "A", 1));
        deck.add(new Card("❤︎︎", "2", 2));
        deck.add(new Card("❤︎︎", "3", 3));
        deck.add(new Card("❤︎", "4", 4));
        deck.add(new Card("❤︎", "5", 5));
        deck.add(new Card("❤︎︎", "6", 6));
        deck.add(new Card("❤︎", "7", 7));
        deck.add(new Card("❤︎", "8", 8));
        deck.add(new Card("❤︎", "9", 9));
        deck.add(new Card("❤︎", "10", 10));
        deck.add(new Card("❤︎", "J", 10));
        deck.add(new Card("❤︎", "Q", 10));
        deck.add(new Card("❤︎", "K", 10));
        deck.add(new Card("♦", "A", 1));
        deck.add(new Card("♦︎", "2", 2));
        deck.add(new Card("♦︎", "3", 3));
        deck.add(new Card("♦︎", "4", 4));
        deck.add(new Card("♦︎", "5", 5));
        deck.add(new Card("♦︎", "6", 6));
        deck.add(new Card("♦︎", "7", 7));
        deck.add(new Card("♦︎", "8", 8));
        deck.add(new Card("♦︎", "9", 9));
        deck.add(new Card("♦︎", "10", 10));
        deck.add(new Card("♦︎", "J", 10));
        deck.add(new Card("♦︎", "Q", 10));
        deck.add(new Card("♦︎", "K", 10));
        deck.add(new Card("♣︎", "A", 1));
        deck.add(new Card("♣︎︎", "2", 2));
        deck.add(new Card("♣︎", "3", 3));
        deck.add(new Card("♣︎︎", "4", 4));
        deck.add(new Card("♣︎", "5", 5));
        deck.add(new Card("♣︎", "6", 6));
        deck.add(new Card("♣︎", "7", 7));
        deck.add(new Card("♣︎", "8", 8));
        deck.add(new Card("♣︎", "9", 9));
        deck.add(new Card("♣︎", "10", 10));
        deck.add(new Card("♣︎", "J", 10));
        deck.add(new Card("♣︎", "Q", 10));
        deck.add(new Card("♣︎", "K", 10));
    }

    public List<Card> getDeck() {
        return deck;
    }
}
