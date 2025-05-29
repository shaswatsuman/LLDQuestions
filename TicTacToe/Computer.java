package Questions.TicTacToe;
import java.util.Random;

public class Computer extends Player{
   
   public Computer(String name, char symbol) {
     super(name, symbol);
   }

   @Override
   public void makeMove(Board board) {
    int row, col;
    while(true) {
      Random rand = new Random();
      System.out.println(name + "'s turn. Enter the row and column (0-2): ");
      row = rand.nextInt(3);
      col = rand.nextInt(3);
      
      if(board.makeMove(row, col, symbol))
       break;
      else
       System.out.println("Invalid move, try again");
    }
   }
}