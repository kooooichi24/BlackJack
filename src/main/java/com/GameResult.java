package main.java.com;

public enum GameResult {
    PLAYER_WIN("PLAYER"),
    DEALER_WIN("DEALER"),
    DRAW("DRAW");

    private String result;

    private GameResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
