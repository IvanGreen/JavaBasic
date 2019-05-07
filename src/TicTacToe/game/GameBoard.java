package TicTacToe.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameBoard extends JFrame {

    static int dimension = 3; // размерность поля
    static int cellSize = 150; // рахмер одной клекти
    private char[][] gameField; // матрица игры
    private GameButton[] gameButtons; //массив кнопок

    Game game;

    public static char nullSymbol = '\u0000'; // null symbol

    public GameBoard(Game currentGame) {
        this.game = currentGame;
        initField();
    }

    public void initField() {
        setBounds(cellSize * dimension, cellSize * dimension, 400, 300);
        setPreferredSize(new Dimension(400, 300));
        setTitle("Крестики-нолики");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel(); // панель управления игрой
        JButton newGameButton = new JButton("Новая игра");
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptyField();
                game.setCurrentPlayerTurn(0);
            }
        });

        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
        controlPanel.add(newGameButton);
        controlPanel.setSize(cellSize * dimension, 150);

        JPanel gameFieldPanel = new JPanel(); //панель самой игры
        gameFieldPanel.setLayout(new GridLayout(dimension, dimension));
        gameFieldPanel.setSize(cellSize * dimension, cellSize * dimension);

        gameField = new char[dimension][dimension];
        gameButtons = new GameButton[dimension * dimension];

        // инициализация игрового поля
        for (int i = 0; i < dimension * dimension; i++) {
            GameButton fieldButton = new GameButton(i, this);
//            fieldButton.setText(Integer.toString(i));
            gameFieldPanel.add(fieldButton);
            gameButtons[i] = fieldButton;
        }

        getContentPane().add(controlPanel, BorderLayout.NORTH);
        getContentPane().add(gameFieldPanel, BorderLayout.CENTER);
        pack();
        setVisible(true);
        //   getContentPane().setVisible(true);   Почему с этим не работает ?
    }

    public void emptyField() {
        for (int i = 0; i < dimension * dimension; i++) {
            gameButtons[i].setText("");
            gameButtons[i].setEnabled(true);
            int x = i / GameBoard.dimension;
            int y = i % GameBoard.dimension;
            gameField[y][x] = nullSymbol;
        }
    }

    public void disableField() {
        for (int i = 0; i < dimension * dimension; i++) {
            gameButtons[i].setEnabled(false);
        }
    }

    public Game getGame() {
        return game;
    }

    /**
     * Проверка доступности клекти для хода
     *
     * @param x горизонталь
     * @param y вертикаль
     * @return
     */
    boolean isTurnable(int y, int x) {
        boolean result = false;

        if (gameField[y][x] == nullSymbol)
            result = true;

        return result;
    }

    /**
     * Обновление матрицы игры после хода
     *
     * @param x горизонталь
     * @param y вертикаль
     */
    public void updateGameField(int y, int x) {
        gameField[y][x] = game.getCurrentPlayer().getPlayerSign();
        gameButtons[GameBoard.dimension * y + x].setText(Character.toString(game.getCurrentPlayer().getPlayerSign()));
    }

    public boolean isFull() {
        boolean result = true;

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (gameField[i][j] == nullSymbol)
                    result = false;
            }
        }

        return result;
    }

    public GameButton getGameButton(int buttonIndex) {
        return gameButtons[buttonIndex];
    }

    public int getDimension() {
        return dimension;
    }

    public char[][] getGameField() {
        return gameField;
    }

    public char getNullSymbol() {
        return nullSymbol;
    }
}
