
public class TicTacToe {

    static  String[] board;
    static  String turn;

    static void printBoard() {
        System.out.printf("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " | ");
        System.out.println("|---+---+---|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " | ");
        System.out.println("|---+---+---|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " | ");
        System.out.printf("|---|---|---|");
    }

    public static void main(String[] args) {
        board = new String[9];
        turn = "X";

        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();
    }
}