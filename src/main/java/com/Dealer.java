package main.java.com;

import java.util.Scanner;

public class Dealer {
    private Hands hands;

    public Dealer() {
        hands = new Hands();
    }

    public int getTotalScore() {
        return hands.getTotalScore();
    }

    public void hit(Card card) {
        hands.addCard(card);
    }

    public boolean isHit() {
        System.out.print("ヒットしますか？[y/n]: ");
        Scanner scanner = new Scanner(System.in);
        String yn = scanner.nextLine();

        return yn.equals("y") ? true : false;
    }

    public boolean isBust() {
        return hands.isBust();
    }
}
