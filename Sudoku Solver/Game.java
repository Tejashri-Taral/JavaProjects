public class Game {
    Board board;
    Player player;
    boolean solutionFound;

    public Game(Board board,Player player) {
        this.board=board;
        this.player=player;
    }

    public void play() {
        solveSudoko(0,0);
        return;
    }

    public void solveSudoko(int row,int col) {
        if (solutionFound) { 
            return;
        }
        if(row==board.size) {
            System.out.println("Sudoku solved !! by "+ player.getName());
            board.printBoard();
            solutionFound=true;
            return;
        }
        int newRow=0,newCol=0;
        if(col==board.size-1) {
            newRow=row+1;
            newCol=0;
        }
        else {
            newRow=row;
            newCol=col+1;
        }

        if(board.matrix[row][col] !=0) {
            solveSudoko(newRow, newCol);
        } else {
            for(int i=1;i<=9;i++) {
                if(isValidNumber(board.matrix,row,col,i)==true) {
                    board.matrix[row][col]=i;
                    solveSudoko(newRow, newCol);
                    board.matrix[row][col]=0;
                }
            }
        }
    }

    private boolean isValidNumber(int[][] matrix,int row,int col,int val) {
        for(int i=0;i<matrix.length;i++) {
            if(matrix[row][i]==val) {
                return false;
            }
        }
        for(int i=0;i<matrix.length;i++) {
            if(matrix[i][col]==val) {
                return false;
            }
        }

        int tempRow=(row/3)*3;
        int tempCol=(col/3)*3;

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(matrix[tempRow+i][tempCol+j]==val) {
                    return false;
                }
            }
        }
        return true;
    }

}
