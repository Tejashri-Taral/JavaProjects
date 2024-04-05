package player;

import java.util.Scanner;

public class Player {
    
    String name;
    String contactNo;
    String emailID;
    String address;
    int age;

    public void setPlayerDetails(String name, String address, String contactNo, String emailID, int age) {
        this.name = name;
        this.age = age;
        this.contactNo = contactNo;
        this.address = address;
        this.emailID = emailID; 
    }

    public void setPlayerName (String name) {
        this.name = name;
    }

    public void getPlayerDetails() {
        System.out.println("Player name: " + this.name);
        System.out.println("Player age: " + this.age);
        System.out.println("Player contactNo. : " + this.contactNo);
        System.out.println("Player emailId: "  + this.emailID);
        System.out.println("Player address: " + this.address);
    }

    public String getPlayerName() {
        return this.name;
    }

    public void setPlayerDetailsFromUserInput (Player p) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the player details");
        System.out.println("Enter the player name: ");
        String name = scn.nextLine();
        System.out.println("Enter the player contact number: ");
        String contactNo = scn.nextLine();
        System.out.println("Enter the player address: ");
        String address = scn.nextLine();
        System.out.println("Enter the player Email Id: ");
        String emailID = scn.nextLine();
        System.out.println("Enter the player age");
        int age = scn.nextInt();
        
        p.setPlayerDetails(name, address, contactNo, emailID, age);

    }
}
