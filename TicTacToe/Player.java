package Questions.TicTacToe;

public abstract class Player { // why not interface
    protected String name;
    protected char symbol;
    
    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public abstract void makeMove(Board board);
}
