package item;

public class ItemShelf {
    //Item-> ItemType, price, code, soldOut
    private int itemCode;
    private Item item;
    private boolean soldOut;

    public int getCode() {
        return this.itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode=itemCode;
    }

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item=item;
    }

    public boolean isSoldout() {
        return soldOut;
    }

    public void setSoldout(boolean soldOut) {
        this.soldOut=soldOut;
    }

}
