package main.java.com;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        List<Card> deckList = deck.getDeck();
        for (Card card : deckList) {
            System.out.println(card);
        }

        System.out.println(deck.hit());
    }
}
