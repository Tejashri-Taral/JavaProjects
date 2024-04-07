import coin.Coin;
import item.*;
import vendingMachine.*;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Vending Machine");
        VendingMachine vendingMachine=new VendingMachine();
        System.out.println("Filling the inventory: ");
        fillInventory(vendingMachine);
        System.out.println("Display the inventory: ");
        displayInventory(vendingMachine);

        VendingMachineState vendingMachineState=vendingMachine.getVendingMachineState();
        vendingMachineState.insertCoin(vendingMachine,Coin.FIFTY);
        vendingMachineState.insertCoin(vendingMachine,Coin.TWENTY);

        vendingMachineState.chooseProduct(vendingMachine,102);
        displayInventory(vendingMachine);
    }
    private static void fillInventory(VendingMachine vendingMachine) {
        ItemShelf[] itemShelfSlots=vendingMachine.getInventory().getInventory();
        for(int i=0;i<itemShelfSlots.length;i++) {
            Item item=new Item();
            if(i==0) {
                item.setItemType("OREO");
                item.setPrice(30);
            }
            else if(i==1) {
                item.setItemType("JUICE");
                item.setPrice(40);
            }
            else if(i==2) {
                item.setItemType("SODA");
                item.setPrice(20);
            }
            else if(i==3) {
                item.setItemType("COKE");
                item.setPrice(45);
            }
            else if(i==4) {
                item.setItemType("CHOCOATE");
                item.setPrice(25);
            }
            else if(i==5) {
                item.setItemType("CHIPS");
                item.setPrice(10);
            }
            else if(i==6) {
                item.setItemType("CANDY");
                item.setPrice(5);
            }
            else if(i==7) {
                item.setItemType("DAIRY_MILK");
                item.setPrice(40);
            }
            else if(i==8) {
                item.setItemType("ICE_CREAM");
                item.setPrice(60);
            }
            else if(i==9){
                item.setItemType("PASTRY");
                item.setPrice(30);
            }
            itemShelfSlots[i].setItem(item);
            itemShelfSlots[i].setSoldout(false);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine) {

        for(ItemShelf shelf:itemShelfSlots)
        System.out.println("Item Code: " + shelf.getCode() + " Item: " + shelf.getItem().getType() +" Price: " + shelf.getItem().getPrice() + 
        " isAvailable:" + !shelf.isSoldout());
    }
}
