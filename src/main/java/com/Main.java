package main.java.com;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("start BlackJack");

        Deck deck = new Deck();
        Player player = new Player();

        System.out.print("Initialization Value: ");

        boolean isHit = player.isHit();
        while (isHit) {
            player.hit(deck.hit());

            System.out.println("total score: " + player.getTotalScore());

            isHit = player.isHit();
        }
        player.showHands();
    }
}
