package Questions.TicTacToe;
import java.util.Scanner;

public class HumanPlayer extends Player{
   private Scanner scanner = new Scanner(System.in);
   
   public HumanPlayer(String name, char symbol) {
     super(name, symbol);
   }

   @Override
   public void makeMove(Board board) {
    int row, col;
    while(true) {
      System.out.println(name + "'s turn. Enter the row and column (0-2): ");
      row = scanner.nextInt();
      col = scanner.nextInt();
      
      if(board.makeMove(row, col, symbol))
       break;
      else
       System.out.println("Invalid move, try again");
    }
   }
}