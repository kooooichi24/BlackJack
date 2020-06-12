package main.java.com;

public enum Card {
    SPADE_A("♠", "A", 1),
    SPADE_2("♠", "2", 2),
    SPADE_3("♠", "3", 3),
    SPADE_4("♠", "4", 4),
    SPADE_5("♠", "5", 5),
    SPADE_6("♠", "6", 6),
    SPADE_7("♠", "7", 7),
    SPADE_8("♠", "8", 8),
    SPADE_9("♠", "9", 9),
    SPADE_10("♠", "10", 10),
    SPADE_J("♠", "J", 10),
    SPADE_Q("♠", "Q", 10),
    SPADE_K("♠", "K", 10),
    HEART_A("❤︎", "A", 1),
    HEART_2("❤︎︎", "2", 2),
    HEART_3("❤︎︎", "3", 3),
    HEART_4("❤︎", "4", 4),
    HEART_5("❤︎", "5", 5),
    HEART_6("❤︎︎", "6", 6),
    HEART_7("❤︎", "7", 7),
    HEART_8("❤︎", "8", 8),
    HEART_9("❤︎", "9", 9),
    HEART_10("❤︎", "10", 10),
    HEART_J("❤︎", "J", 10),
    HEART_Q("❤︎", "Q", 10),
    HEART_K("❤︎", "K", 10),
    DIAMOND_A("♦", "A", 1),
    DIAMOND_2("♦︎", "2", 2),
    DIAMOND_3("♦︎", "3", 3),
    DIAMOND_4("♦︎", "4", 4),
    DIAMOND_5("♦︎", "5", 5),
    DIAMOND_6("♦︎", "6", 6),
    DIAMOND_7("♦︎", "7", 7),
    DIAMOND_8("♦︎", "8", 8),
    DIAMOND_9("♦︎", "9", 9),
    DIAMOND_1("♦︎", "10", 10),
    DIAMOND_J("♦︎", "J", 10),
    DIAMOND_Q("♦︎", "Q", 10),
    DIAMOND_K("♦︎", "K", 10),
    CLUB_A("♣︎", "A", 1),
    CLUB_2("♣︎︎", "2", 2),
    CLUB_3("♣︎", "3", 3),
    CLUB_4("♣︎︎", "4", 4),
    CLUB_5("♣︎", "5", 5),
    CLUB_6("♣︎", "6", 6),
    CLUB_7("♣︎", "7", 7),
    CLUB_8("♣︎", "8", 8),
    CLUB_9("♣︎", "9", 9),
    CLUB_1("♣︎", "10", 10),
    CLUB_J("♣︎", "J", 10),
    CLUB_Q("♣︎", "Q", 10),
    CLUB_K("♣︎", "K", 10);


    private String suit; // トランプの記号はスートと呼ばれる
    private String rank;
    private int value;

    private Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getRank() {
        return rank;
    }

    public int aceIs21() {
        return 21;
    }

    @Override
    public String toString() {
        return suit + rank + ":" + value;
    }
}
