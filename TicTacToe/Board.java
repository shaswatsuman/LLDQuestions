package Questions.TicTacToe;

public class Board {
    private char board[][];
    private final int SIZE = 3; // final is used here because
    
    public Board() {
        board = new char[SIZE][SIZE];
        initialize();
    }

    private void initialize() {
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public boolean makeMove(int row, int col, char symbol) {
        if(board[row][col] == ' ') {
            board[row][col] = symbol;
            return true;
        }

        return false;
    }

    public void printBoard() {
        for(char[] row : board) {
            for(char cell : row)
             System.out.print("|" + cell);
            System.out.println("|");
        }
    }

    public boolean checkWin(char symbol) {
        // Check rows
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol)
                return true;
        }

        // Check columns
        for (int i = 0; i < SIZE; i++) {
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)
                return true;
        }

        // Check diagonals
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
            return true;
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
            return true;

        return false;
    }

    public boolean isFull() {
        for(char[] row : board) {
            for(char cell : row) {
                if(cell == ' ')
                 return false;
            }
        }

        return true;
    }
}
