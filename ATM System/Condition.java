public enum Condition {
    WORKING("Working"),
    TECHNICAL_ERROR("Technical Error"),
    OUT_OF_BALANCE("Out of Balance"),
    ABANDONED("Abandoned");

    private String val;

    Condition(String val) {
        this.val=val;
    }

    public String getValue() {
        return this.val;
    }

}
