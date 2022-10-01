import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char [][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };
        printGameBoard(gameBoard);
    }

    public static void printGameBoard(char [][] gameBoard) {
        for (char[] row : gameBoard) {
            System.out.println(row);
        }
    }
}
