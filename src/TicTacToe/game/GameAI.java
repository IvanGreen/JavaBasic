package TicTacToe.game;

public class GameAI {
    private static int LAST_CELL_TO_LOSE; // признак, когда остается лишь 1 клетка до победы человека =-(SIZE-2)
    private static int dimension;
    private static char aiSymbol;
    private static char nullSymbol;

    public static SelectedCell Turn(GameBoard board) {
        int x = 0, y = 0;
        int cellWeight = 0;
        boolean isCellFound = false; // флаг для выхода из циклов в случае, если мы нашли подходящую ячейку
        // this.board = board;
        dimension = board.getDimension();
        LAST_CELL_TO_LOSE = -(dimension - 2);
        int[][] weightArr = new int[dimension][dimension];


        char[][] gameField = board.getGameField();

        nullSymbol=board.getNullSymbol();
        if (!board.getGame().getCurrentPlayer().isRealPlayer())
            aiSymbol = board.getGame().getCurrentPlayer().getPlayerSign();


        // Логика хода компа
        for (int i = 0; i < dimension && !isCellFound; i++) {
            for (int j = 0; j < dimension && !isCellFound; j++) {

                // В случае, если поле не приносит однозначную победу, вычисляем ее вес.
                // Иначе выбираем ее как целевую
                if (board.isTurnable(i,j)) {
                    if (!isWinCombination(i, j, gameField)) {
                        weightArr[i][j] = gameField[i][j] == GameBoard.nullSymbol ? computeWeight(i, j, gameField) : 0;
                        // если мы нашли ячейку, которая была бы для человека последней необходимой для победы,
                        // то незамдлительно выбираем ее как целевую. Иначе просто ищем ячейку с наибольшим "весом"
                        if (weightArr[i][j] > cellWeight || weightArr[i][j] == LAST_CELL_TO_LOSE) {
                            y = i;
                            x = j;
                            cellWeight = weightArr[i][j];
                            if (weightArr[i][j] == LAST_CELL_TO_LOSE) isCellFound = true;
                        }
                    } else {
                        y = i;
                        x = j;
                        isCellFound = true;
                    }
                }
            }
        }

        // Обновление поля игры
        board.updateGameField(y,x);

        // update button content
//        int cellIndex = GameBoard.dimension * y + x;
//        board.getGameButton(cellIndex).setText(Character.toString(board.getGame().getCurrentPlayer().getPlayerSign()));

        return new SelectedCell(y, x);

    }

    private static int computeWeight(int y, int x, char[][] gameField) {

        int row = 0;
        int column = 0;
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        int lastHope = LAST_CELL_TO_LOSE;


        //проверка победы, проверить диагонали, вертикали и столбцы
        if ((y + x + 1) == dimension) {
            // проверяем диагонали
            // диагональ - /
            for (int i = 0; i < dimension; i++) {
                rightDiagonal = (gameField[i][dimension - 1 - i] == aiSymbol ||gameField[i][dimension - 1 - i]==nullSymbol ) ? leftDiagonal + 1 : leftDiagonal - 1;

            }
        }
        // диагональ - \
        if (y == x) {
            for (int i = 0; i < dimension; i++) {
                leftDiagonal = (gameField[i][i] == aiSymbol || gameField[i][i]==nullSymbol) ? rightDiagonal + 1 : rightDiagonal - 1;
            }
        }
        //горизонтали
        for (int i = 0; i < dimension; i++) {
            row = (gameField[y][i] == aiSymbol || gameField[y][i]==nullSymbol) ? row + 1 : row - 1;
        }
        //вертикали
        for (int i = 0; i < dimension; i++) {
            column = (gameField[i][x] == aiSymbol || gameField[i][x]==nullSymbol) ? column + 1 : column - 1;
        }


        if (row == lastHope || column == lastHope || leftDiagonal == lastHope || rightDiagonal == lastHope)
            return LAST_CELL_TO_LOSE;
        else
            return row + column + leftDiagonal + rightDiagonal;
    }

    private static boolean isWinCombination(int y, int x, char[][] gameField) {
        boolean result = false;

        if (gameField[y][x] == GameBoard.nullSymbol) {

            // диагональ справа на лево
            if (y == x) {
                for (int n = 0, count = 0; n < dimension && !result; n++) {
                    if (gameField[n][n] == aiSymbol) ++count;
                    if (count == dimension - 1) {
                        result = true;
                    }
                }
            }

            // диагональ слева на право
            if (y + x + 1 == dimension) {
                for (int n = 0, count = 0; n < dimension && !result; n++) {
                    if (gameField[n][dimension - n - 1] == aiSymbol) ++count;
                    if (count == dimension - 1) {
                        result = true;
                    }
                }
            }

            //столбец
            for (int n = 0, count = 0; n < dimension && !result; n++) {
                if (gameField[n][x] == aiSymbol) ++count;
                if (count == dimension - 1) {
                    result = true;
                }
            }

            //строка
            for (int n = 0, count = 0; n < dimension && !result; n++) {
                if (gameField[y][n] == aiSymbol) ++count;
                if (count == dimension - 1) {
                    result = true;
                }
            }
        }

        return result;
    }
}
