package item;

public class Item {
    private String itemType;
    private int price;

    public String getType() {
        return this.itemType;
    }

    public void setItemType(String itemType) {
        this.itemType=itemType;
    }
    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price=price;
    }
}
