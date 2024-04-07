package item;

public enum ItemType {

    OREO("OREO"),
    JUICE("JUICE"),
    SODA("SODA"),
    COKE("COKE"),
    CHOCOLATE("CHOCOLATE"),
    CHIPS("CHIPS"),
    CANDY("CANDY"),
    DAIRY_MILK("DAIRY_MILK"),
    ICE_CREAM("ICE_CREAM"),
    PASTRY("PASTRY");


    private final String type;
    ItemType (String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }


}
