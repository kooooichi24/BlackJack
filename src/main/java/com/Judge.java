package main.java.com;

public class Judge {
    public String jugdeWinnter(Player player, Dealer dealer) {
        // bust
        if (player.isBust() && dealer.isBust()) {
            return "DEALER";
        }
        if (player.isBust()) {
            return "DEALER";
        }
        if (dealer.isBust()) {
            return "PLAYER";
        }

        // compare
        if (player.getTotalScore() <= dealer.getTotalScore()) {
            return "DEALER";
        }
        if (player.getTotalScore() > dealer.getTotalScore()) {
            return "PLAYER";
        }
        return "hoge";
    }
}
