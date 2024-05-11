import java.util.*;

public class Board {
    int size;
    int matrix[][];

    public Board(int size) {
        this.size=size;
        this.matrix=new int[size][size];
    }

    public void printBoard() {
        for(int i=0;i<this.size;i++) {
            for(int j=0;j<this.size;j++) {
                System.out.print(matrix[i][j]+"  ");
            }   
            System.out.println();
        }
    }

    public void setBoardConfig(int row,int col,int val) {
        matrix[row][col]=val;
    }

    //Another way to fill mat
    public void setBoardColumnWise(int row, List<Integer> col, List<Integer>val){
        for(int i=0;i<col.size();i++) {
            matrix[row][col.get(i)]= val.get(i);
        }
    }

    //Another way to setup mat
    public void setUpBoard(List<Triplet>list) {
        for(int i=0;i<list.size();i++) {
            matrix[list.get(i).row][list.get(i).col]=list.get(i).val;
        }
    }

}
