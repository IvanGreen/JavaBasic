package TicTacToe.game;

public class SelectedCell {
    private int y;
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    SelectedCell(int y, int x)
    {

        this.setY(y);
        this.setX(x);
    }
}
