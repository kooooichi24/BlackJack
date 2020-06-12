package main.java.com;

public class Main {
    public static void main(String[] args) {
        System.out.println("start BlackJack");

        Deck deck = new Deck();
        Player player = new Player();
        Dealer dealer = new Dealer();
        Judge judge = new Judge();

        System.out.print("Initialization Value: ");

        boolean isHit = player.isHit();
        while (isHit) {
            player.hit(deck.hit());
            if (player.isBust()) break;

            System.out.print("PLAYER HANDS: ");
            player.showHands();
            isHit = player.isHit();
        }

        while (dealer.getTotalScore() < 17) {
            dealer.hit(deck.hit());
        }

        String winner = judge.jugdeWinnter(player, dealer);
        System.out.println("----------------------------------------");
        System.out.print("PLAYER HANDS            : ");
        player.showHands();
        System.out.println("PLAYER FINAL TOTAL SCORE: " + player.getTotalScore());
        System.out.println("----------------------------------------");
        System.out.print("DEALER HANDS            : ");
        dealer.showHands();
        System.out.println("DEALER FINAL TOTAL SCORE: " + dealer.getTotalScore());
        System.out.println("----------------------------------------");
        System.out.println("WINNER: " + winner);
        System.out.println("----------------------------------------");
    }
}