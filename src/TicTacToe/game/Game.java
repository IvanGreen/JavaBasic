package TicTacToe.game;


import javax.swing.*;

public class Game {
    private GameBoard board; //ссылка на игровое поле
    private GamePlayer[] gamePlayers = new GamePlayer[2]; // массив игроков



    private int playersTurn = 0; // индекс текущего игрока

    public Game() {
        this.board = new GameBoard(this);
    }

    public void initGame() {
        gamePlayers[0] = new GamePlayer(true, 'X');
        gamePlayers[1] = new GamePlayer(false, 'O');
    }

    public void setCurrentPlayerTurn(int playerIndex) {
        this.playersTurn = playerIndex;
    }

    void passTurn() {
        playersTurn = playersTurn == 0 ? 1 : 0;
    }

    /**
     * Получение текущего объекта игрока
     *
     * @return GamePlayer объект игрока
     */
    GamePlayer getCurrentPlayer() {
        return gamePlayers[playersTurn];
    }

    /**
     * Метод показа popup-a для пользователя
     *
     * @param messageText текст сообщения
     */
    void showMessage(String messageText) {
        JOptionPane.showMessageDialog(board, messageText);
    }

    /**
     * проверка победы после проставновки очередной клетик
     * @param board
     * @param cell - клетка y-вертикаль x-горизонталь
     * @return
     */
    public boolean checkWin(GameBoard board, SelectedCell cell) {
        char playerSymbol = board.getGame().getCurrentPlayer().getPlayerSign();
        int dimension=board.getDimension();
        char[][] gameField=board.getGameField();
        boolean row = true;
        boolean column = true;
        boolean leftDiagonal = true;
        boolean rightDiagonal = true;
        int y=cell.getY();
        int x=cell.getX();
        //Победа, если все символы на линии == playerSymbol

        // диагональ слева направо
        if ((y + x + 1) == dimension) {
            for (int i = 0; i < dimension; i++) {
                if (gameField[i][dimension - 1 - i] != playerSymbol)
                    leftDiagonal = false;
            }
        } else leftDiagonal = false;

        //диагональ справа налево
        if (y == x) {
            for (int i = 0; i < dimension; i++) {
                if (gameField[i][i] != playerSymbol)
                    rightDiagonal = false;
            }
        } else rightDiagonal = false;

        if (!(rightDiagonal || leftDiagonal)) {
            //горизонталь
            for (int i = 0; i < dimension; i++) {
                if (gameField[y][i] != playerSymbol) row = false;
            }
        }
        if (!(rightDiagonal || leftDiagonal || row)) {
            //вертикаль
            for (int i = 0; i < dimension; i++) {
                if (gameField[i][x] != playerSymbol) column = false;
            }
        }


        return (rightDiagonal || leftDiagonal || row || column);
    }
}
