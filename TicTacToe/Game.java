package Questions.TicTacToe;

public class Game {
    private Board board;
    private Player playerX;
    private Player playerO;

    public Game(Player p1, Player p2) {
        board = new Board();
        this.playerX = p1;
        this.playerO = p2;
    }

    public void start() {
        Player currentPlayer = playerX;
        
        while(true) {
           board.printBoard();
           currentPlayer.makeMove(board);
           
           if(board.checkWin(currentPlayer.symbol)) {
             System.out.println(currentPlayer.name + " wins!");
             break;
           }
           else if(board.isFull()) {
             System.out.println("It's a draw!");
             break;
           }

           currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
        }
    }
}
