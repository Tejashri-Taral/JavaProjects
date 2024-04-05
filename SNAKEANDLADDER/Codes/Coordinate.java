package coordinate;

public class Coordinate {
    int row;
    int column;

    public Coordinate(int row,int column) {
        this.row=row;
        this.column=column;
    }

    public String getCoordinate() {
        StringBuilder sb=new StringBuilder();
        sb.append("[").append(this.row).append(",").append(this.column).append("]");
        return sb.toString();
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.column;
    }

}
