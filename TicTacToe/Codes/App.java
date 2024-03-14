import board.Board;
import player.Player;
import game.Game;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First Project -> TicTacToe");
        Board b=new Board(3,'-');
       
       // Player p1=new Player();
       // p1.setPlayerDetails("Ravi", "9875671190" , "Ravi@gmail.com", "karnataka", 18, 'x');
        //p1.getPlayerNameAndSymbol();
        Player p1=new Player();
        p1.setPlayerNameAndSymbol("Ravi",'x');
        p1.getPlayerNameAndSymbol();
        
        Player p2=new Player();
        p2.setPlayerNameAndSymbol("kanika",'o');
        p2.getPlayerNameAndSymbol();

        Game game=new Game(new Player[] {p1,p2},b);
        game.Play();
    }
}
