package board;

public class Board {
   public int size;
   public char mat[][];

   public Board(int size,char symbol) {
    this.size=size;
    mat=new char[size][size];

    for(int i=0;i<size;i++) {
        for(int j=0;j<size;j++) {
            mat[i][j]=symbol;
       }
     }

    }


   public void printBoardConfig() {
    int sz=this.size;

    for(int i=0;i<sz;i++) {
        for(int j=0;j<sz;j++) {
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
   }
}
