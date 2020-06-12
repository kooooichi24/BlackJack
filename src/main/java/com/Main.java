package main.java.com;

public class Main {
    public static void main(String[] args) {
        System.out.println("start BlackJack");

        Deck deck = new Deck();
        Player player = new Player();
        Dealer dealer = new Dealer();
        Judge judge = new Judge();

        System.out.print("Initialization Value: ");

        // player
        while (player.isHit()) {
            player.hit(deck.hit());
            if (player.isBust()) break;

            System.out.print("PLAYER HANDS: ");
            player.showHands();
        }

        // dealer
        while (dealer.isHit()) {
            dealer.hit(deck.hit());
        }

        System.out.println("----------------------------------------");
        System.out.print("PLAYER HANDS            : ");
        player.showHands();
        System.out.println("PLAYER FINAL TOTAL SCORE: " + player.getTotalScore());
        System.out.println("----------------------------------------");
        System.out.print("DEALER HANDS            : ");
        dealer.showHands();
        System.out.println("DEALER FINAL TOTAL SCORE: " + dealer.getTotalScore());
        System.out.println("----------------------------------------");
        System.out.println(judge.jugdeWinner(player, dealer));
        System.out.println("----------------------------------------");
    }
}