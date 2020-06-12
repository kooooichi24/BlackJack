package main.java.com;

public class Judge {
    public GameResult jugdeWinner(Player player, Dealer dealer) {
        // bust
        if (player.isBust() && dealer.isBust()) {
            return GameResult.DEALER_WIN;
        }
        if (player.isBust()) {
            return GameResult.DEALER_WIN;
        }
        if (dealer.isBust()) {
            return GameResult.PLAYER_WIN;
        }

        // compare
        if (player.getTotalScore() < dealer.getTotalScore()) {
            return GameResult.DEALER_WIN;
        }
        if (player.getTotalScore() > dealer.getTotalScore()) {
            return GameResult.PLAYER_WIN;
        }

        return GameResult.DRAW;
    }
}
