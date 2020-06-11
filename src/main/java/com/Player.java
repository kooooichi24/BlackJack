package main.java.com;

import java.util.Scanner;

public class Player {
    private Hands hands;

    public Player() {
        hands = new Hands();
    }

    public void hit(Card card) {
        hands.addCard(card);
    }

    public int getTotalScore() {
        int totalScore = hands.getTotalScore();
        return totalScore;
    }

    public boolean isHit() {
        System.out.print("ヒットしますか？[y/n]: ");
        Scanner scanner = new Scanner(System.in);
        String yn = scanner.nextLine();

        return yn.equals("y") ? true : false;
    }

    public void showHands() {
        System.out.println(hands);
    }
}
