package TicTacToe;

import TicTacToe.game.Game;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Game gameInstance=new Game();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                gameInstance.initGame();
            }
        });

    }
}
