package vendingMachine;

import coin.Coin;
import inventory.Inventory;
import java.util.*;

public class VendingMachine {
    private VendingMachineState vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine() {
        vendingMachineState=new VendingMachineState();
        inventory=new Inventory(10);
        coinList=new ArrayList<>();
    }

    public VendingMachineState getVendingMachineState() {
        return this.vendingMachineState;
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState) {
        this.vendingMachineState=vendingMachineState;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory=inventory;
    }

    public List<Coin> getCoinList() {
        return this.coinList;
    }

    public void setCoinList(List<Coin>coinList) {
        this.coinList=coinList;
    }

}
