public enum Verdict {
    //for the transaction
    SUCCESS("Success"),
    FAILURE("Failure"),
    OUT_OF_MONEY("Out of Money"),
    SOFTWARE_ERROR("Software Error"),
    HARDWARE_ERROR("HArdware_Error"),
    MAX_LIMIT("Exceed maximum withdraw limit");


    private String val;

    Verdict(String val) {
        this.val=val;
    }

    public String getVal() {
        return this.val;
    }

}
