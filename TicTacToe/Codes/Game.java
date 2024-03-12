package game;

import board.Board;
import player.Player;
import java.util.*;

public class Game {
    Player[] players;
    Board board;
    int turn;
    int noOfMoves;
    boolean isGameOver;
    String zero;
    String cross;

    public Game(Player[] players, Board board) {

        this.players=players;
        this.board=board;
        this.turn=0;
        this.noOfMoves=0;
        this.isGameOver=false;

        StringBuilder z=new StringBuilder();
        StringBuilder c=new StringBuilder();

        for(int i=0;i<board.size;i++) {
            z.append('o');
            c.append('x');
        }

        zero=z.toString();
        cross=c.toString();

    }

    public void printBoardConfig() {
        int sz=this.board.size;
        for(int i=0;i<sz;i++) {
            for(int j=0;j<sz;j++) {
                System.out.print(board.mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void Play() {
        printBoardConfig();
        int sz=board.size;

        while(!isGameOver) {
            noOfMoves++;
            int index=getIndex();

            int row=index/sz;
            int col=index%sz;

            board.mat[row][col]= players[turn].getPlayerSymbol();

            if(noOfMoves>=sz*sz) {
                System.out.println("Game Draw");
                return;
            }

            if(noOfMoves>=2*sz-1 && checkCombinations()==true) {
                isGameOver=true;
                printBoardConfig();
                System.out.println("Winner is :"+players[turn].getPlayerName());
            }

            //turn=0 ->turn=(0+1)%2=1
            //turn=1 ->turn=(1+1)%2=0
            turn=(turn+1)%2;
            printBoardConfig();;
        }

    }

    public int getIndex() {
        while(true) {
        System.out.println("Name of Player: "+players[turn].getPlayerName()+ " give one position");
        Scanner sc=new Scanner(System.in);
        int pos= sc.nextInt()-1;
        int size=board.size;

        int row=pos/size;
        int col=pos%size;

        //checking invalid position
        if(row<0 || row>=size || col<0 || col>=size) {
            System.out.println("Enter valid position");
            continue;
        }

        //checking is space occupied or not
        if(board.mat[row][col]!='-') {
            System.out.println("Position is already occupied");
            continue;
        }
        return pos;
    }
}
 
public boolean checkCombinations() {
    int sz= board.size;

    for(int i=0;i<sz;i++) {
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<sz;j++) {
            sb.append(board.mat[i][j]);
        }
        String str=sb.toString();
        if(str.equals(zero) || str.equals(cross)) {
            return true;
        }
    }

    for(int i=0;i<sz;i++) {
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<sz;j++) {
            sb.append(board.mat[j][i]);
        }
        String str=sb.toString();
        if(str.equals(zero) || str.equals(cross)) {
            return true;
        }
    }

    //diagonal
    int i=0,j=0;
    StringBuilder sb=new StringBuilder();
    while(i<sz) {
        sb.append(board.mat[i][j]);
        i++;
        j++;
    }

    String pattern=sb.toString();
    if(pattern.equals(zero) || pattern.equals(cross)) {
        return true;
    }

    //Anti-diagonal
    i=0;
    j=sz-1;
    sb=new StringBuilder();
    while(i<sz) {
        sb.append(board.mat[i][j]);
        i++;
        j--;
    }

    pattern=sb.toString();
    if(pattern.equals(zero) || pattern.equals(cross)) {
        return true;
    }
    return false;
}
}
