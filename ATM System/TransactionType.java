public enum TransactionType {
    CREDIT("Credit"),
    DEBIT("Debit"),
    FAILED("Failed");

    private String val;
    TransactionType(String val) {
        this.val=val;
    }

    public String getVal() {
        return this.val;
    }

}
