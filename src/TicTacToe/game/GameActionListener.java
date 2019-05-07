package TicTacToe.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameActionListener implements ActionListener {
    private int row;
    private int cell;
    private GameButton button;

    public GameActionListener(int row, int cell, GameButton button) {
        this.row = row;
        this.cell = cell;
        this.button = button;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        GameBoard board = button.getBoard();

        if (board.isTurnable(row, cell)) {
            updateByPlayersData(board);

            if (board.isFull()) {
                board.getGame().showMessage("Ничья");
                board.disableField();
            } else {
                updateAIData(board);
            }
        } else {
            board.getGame().showMessage("Некорректный ход");
        }
    }

    // logic for AI turns
    private void updateAIData(GameBoard board) {
        SelectedCell cell = GameAI.Turn(board);
        if (board.game.checkWin(board, cell)) {
            button.getBoard().getGame().showMessage("Вы проиграли");
            board.disableField();
        } else {
            board.getGame().passTurn();
        }

    }

    private void updateByPlayersData(GameBoard board) {
        board.updateGameField(row, cell);

   //     button.setText(Character.toString(board.getGame().getCurrentPlayer().getPlayerSign()));

        if (board.game.checkWin(board, new SelectedCell(row, cell))) {
            button.getBoard().getGame().showMessage("Вы выйграли");
            board.updateGameField(row, cell);
            board.disableField();
        } else {
            board.getGame().passTurn();
        }
    }


}
