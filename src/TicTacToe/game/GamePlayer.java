package TicTacToe.game;

public class GamePlayer {
    private char playerSign;
    private boolean realPlayer;

    public GamePlayer(boolean isRealPlayer, char playerSign) {
        this.playerSign = playerSign;
        this.realPlayer = isRealPlayer;
    }

    public boolean isRealPlayer() {
        return realPlayer;
    }

    public char getPlayerSign() {
        return playerSign;
    }
}
