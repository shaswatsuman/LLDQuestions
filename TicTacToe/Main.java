package Questions.TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Welcome to Tic Tac Toe!");

            System.out.println("Enter your name (Symbol X): ");
            String name1 = scanner.nextLine();

            Player player1 = new HumanPlayer(name1, 'X');

            System.out.println("Do you want to play against human or computer? (Enter 'H' or 'C'):");
            String choice = scanner.nextLine().trim().toUpperCase();

            Player player2;

            if (choice.equals("H")) {
                System.out.println("Enter name for player 2 (Symbol O): ");
                String name2 = scanner.nextLine();
                player2 = new HumanPlayer(name2, 'O');
            } else {
                player2 = new Computer("Computer", 'O');
            }

            Game game = new Game(player1, player2);
            game.start();
        } finally {
            scanner.close();
        }
    }
}
