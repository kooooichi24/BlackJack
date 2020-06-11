package main.java.com;

public class Card {
    private String suit; // トランプの記号はスートと呼ばれる
    private String rank;
    private int value;

    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    @Override
    public String toString() {
        return suit + rank + ":" + value;
    }
}
