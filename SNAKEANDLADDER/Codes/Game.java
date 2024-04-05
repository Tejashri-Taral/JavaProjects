package game;

import coordinate.Coordinate;
import player.Player;
import dice.Dice;
import board.Board;
import jumper.Jumper;

public class Game {

  Board board;
  Player[] players;
  boolean isAllow[];
  int turn;
  Coordinate[] places;
  Dice dice;

  public Game(Board board,Player[] players,Dice dice) {
    this.board=board;
    this.dice=dice;
    this.players=players;
    turn=0;
    isAllow=new boolean[players.length];
    places=new Coordinate[players.length];

    for(int i=0;i<players.length;i++) {
        places[i]=new Coordinate(board.getSize()-1, 0);
    }
  }

  public void play() {
    while(true) {
        int num=dice.diceRoll();
        System.out.println(players[turn].getPlayerName() + " rolled -> "+ num + places[turn]);

        if(!isAllow[turn]) {
            if(num!=1) {
                turn=1^turn;
                continue;
            }else {
                isAllow[turn]=true;
            }
        }
        Coordinate newCoordinate=getNewCoordinate(places[turn],num);

        if(newCoordinate.getRow()<0) {
            System.out.println(players[turn].getPlayerName()+ " has won.");
            return;
        }

        places[turn]=newCoordinate;
        turn=1^turn;

    }
  } 

  private Coordinate getNewCoordinate(Coordinate oldCoordinates,int num) {
    int row=oldCoordinates.getRow();
    int col=oldCoordinates.getCol();

    while(num>0) {
        if(row%2!=0) {
            if(col==board.getSize()-1) row--;
            else col++;
        }
        else {
            if(col==0) row--;
            else col--;
        }
        num--;
    }

    if(row<0) return new Coordinate(row, col);
    if(checkJumperExist(row,col)) {
        Jumper jumper=board.jumpers.get(board.board[row][col]);

        return jumper.end;
    }

    return new Coordinate(row, col);
  }


  private boolean checkJumperExist(int row,int col) {
    return board.jumpers.containsKey(board.board[row][col]);
  }
 
}
