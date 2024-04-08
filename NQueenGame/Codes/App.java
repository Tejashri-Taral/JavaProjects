import board.QueenBoard;
import game.NQueenGame;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("NQUEEN PROBLEM");
        QueenBoard b=new QueenBoard(4);
        NQueenGame game=new NQueenGame(b);
        game.play();
    }
}
