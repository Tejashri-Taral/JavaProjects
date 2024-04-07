package inventory;

import item.ItemShelf;
import item.Item;

public class Inventory {
    private ItemShelf[] inventory;

    public Inventory(int n) {
        inventory=new ItemShelf[n];
        initialEmptyInventory();

    }

    public ItemShelf[] getInventory() {
        return this.inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory=inventory;
    }

    public void initialEmptyInventory() {
        int startCode=101;
        for(int i=0;i<inventory.length;i++) {
            ItemShelf itemshelf=new ItemShelf();
            itemshelf.setItemCode(startCode);
            itemshelf.setSoldout(true);
            inventory[i]=itemshelf;
            startCode++;
        }
    }

    public void addItem(Item item,int itemCode) {
        for(ItemShelf shelf:inventory) {
            if(shelf.getCode()==itemCode) {
                if(shelf.isSoldout() ==true) {
                  shelf.setItem(item);
                  shelf.setSoldout(false);
                }
            }
        }
    }

    public Item getItem(int itemCode) {
        for(ItemShelf shelf:inventory) {
            if(shelf.getCode() == itemCode) {
                if(shelf.isSoldout()) {
                    System.out.println("Item is already soldout");
                    return new Item();
                } else {
                    return shelf.getItem();
                }
            }
        }
        System.out.println("Invalid item Code");
        return new Item();
    }

    public void updateSoldOut(int itemCodeNumber) {
        for(ItemShelf shelf:inventory) {
            if(shelf.getCode() == itemCodeNumber) {
                shelf.setSoldout(true);
            }
        }

    }

}
