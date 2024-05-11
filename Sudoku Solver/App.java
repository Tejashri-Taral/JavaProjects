import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome in Sudoku Solver");
        Player p=new Player("Rajani", 21);
        System.out.println(p.getName());

        Board b=new Board(9);
        b.setBoardConfig(0, 0, 3);
        b.setBoardConfig(0,2,6);
        b.setBoardConfig(0,3,5);
        b.setBoardConfig(0,5,8);

        List<Integer> col=new ArrayList<>();
        List<Integer> val=new ArrayList<>();

            col.add(0);
            col.add(1);

            val.add(5);
            val.add(2);
        
            b.setBoardColumnWise(1, col, val);

            List<Triplet> triple=new ArrayList<>();
            triple.add(new Triplet(2, 1, 8));
            triple.add(new Triplet(2,2,7));
            triple.add(new Triplet(2, 7, 3));
            triple.add(new Triplet(2, 8, 1));
            triple.add(new Triplet(3, 2, 3));
            triple.add(new Triplet(3, 4, 1));
            triple.add(new Triplet(3, 7, 8));
            triple.add(new Triplet(4,0,9));
            triple.add(new Triplet(4,3,8));
            triple.add(new Triplet(4,4,6));
            triple.add(new Triplet(4, 5, 3));
            triple.add(new Triplet(4, 8,5));
            triple.add(new Triplet(5,1,5));
            triple.add(new Triplet(5, 4, 9));
            triple.add(new Triplet(5,6,6));
            triple.add(new Triplet(6,0,1));
            triple.add(new Triplet(6,1,3));
            triple.add(new Triplet(6, 6, 2));
            triple.add(new Triplet(6,7,5));
            triple.add(new Triplet(7, 7, 7));
            triple.add(new Triplet(7, 8, 4));
            triple.add(new Triplet(8,2,5));
            triple.add(new Triplet(8, 3, 2));
            triple.add(new Triplet(8, 5, 6));
            triple.add(new Triplet(8, 6, 3));

            b.setUpBoard(triple);
            b.printBoard();

            Game game=new Game(b, p);
            game.play();

    }
}
