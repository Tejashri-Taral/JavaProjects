package player;

public class Player {

    private String name;
    private String contactNo;
    private char symbol;
    private String emailID;
    private String address;
    private int age;

    public void setPlayerDetails(String name,String contactNo,String emailID,String address,int age,char symbol) {
        this.name=name;
        this.age=age;
        this.emailID=emailID;
        this.contactNo=contactNo;
        this.address=address;
        this.symbol=symbol;
    }

    public void setPlayerNameAndAge(String name,int age) {
        this.name=name;
        this.age=age;
    }

    public void setPlayerNameAndSymbol(String name,char symbol) {
        this.name=name;
        this.symbol=symbol;
    }

    public void getPlayerNameAndSymbol() {
        System.out.println("Player name :"+this.name);
        System.out.println("Player symbol :"+this.symbol);
    }
    public String getPlayerName() {
        return this.name;
    }

    public char getPlayerSymbol() {
        return this.symbol;
    }

    public void getPlayerDetails() {
        System.out.println("Player name :"+this.name);
        System.out.println("Player Symbol :"+this.symbol);
        System.out.println("Player age :"+this.age);
        System.out.println("Player's address :"+this.address);
        System.out.println("Player emailID :"+this.emailID);
        System.out.println("Player contactNo :"+this.contactNo);
    }
}
