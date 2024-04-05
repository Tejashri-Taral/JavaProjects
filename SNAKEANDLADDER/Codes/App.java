import player.Player;
import java.util.*;
import board.Board;
import dice.Dice;
import coordinate.Coordinate;
import jumper.Jumper;
import game.Game;


public class App {
    public static void main(String[] args) throws Exception {

        HashMap<String, Jumper> map = new HashMap<>();
        map.put("6", new Jumper(new Coordinate(9,5), new Coordinate(6,6)));
        map.put("97", new Jumper(new Coordinate(0,1), new Coordinate(9,9)));
        map.put("21", new Jumper(new Coordinate(7,0), new Coordinate(0,9)));
        map.put("64", new Jumper(new Coordinate(3,3), new Coordinate(7,4)));
        
        Player p1 = new Player();
        p1.setPlayerDetailsFromUserInput(p1);
        Player p2 = new Player();
        p2.setPlayerDetailsFromUserInput(p2);

        System.out.println("Player name: " + p1.getPlayerName());
        System.out.println("Player name: " + p2.getPlayerName());

        Board b = new Board(10, map);
        b.printBoard();

        Game game = new Game(b, new Player[] {p1,p2}, new Dice());
        game.play();
    }

}
