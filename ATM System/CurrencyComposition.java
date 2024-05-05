public class CurrencyComposition {
    private int fiveHundredNotes;
    private int twoHundredNotes;
    private int oneHundredNotes;
    private int fiftyNotes;
    private int tenNotes;

    public CurrencyComposition(int fiveHundredNotes,int twoHundredNotes,int oneHundredNotes,int fiftyNotes,int tenNotes) {
        this.fiveHundredNotes=fiveHundredNotes;
        this.twoHundredNotes=twoHundredNotes;
        this.oneHundredNotes=oneHundredNotes;
        this.fiftyNotes=fiftyNotes;
        this.tenNotes=tenNotes;
    }

    public int getFiveHundredNote() {
        return this.fiveHundredNotes;
    }

    public int getTwoHundredNote() {
        return this.twoHundredNotes;
    }

    public int getOneHundredNote() {
        return this.oneHundredNotes;
    }

    public int getFiftyNote() {
        return this.fiftyNotes;
    }

    public int getTenNote() {
        return this.tenNotes;
    }

    public void setFiveHundredNotes(int notes) {
        this.fiveHundredNotes=this.fiveHundredNotes-notes;
    }

    public void setTwoHundredNotes(int notes) {
        this.twoHundredNotes=this.twoHundredNotes-notes;
    }

    public void setOneHundredNotes(int notes) {
        this.oneHundredNotes=this.oneHundredNotes-notes;
    }

    public void setFiftyNotes(int notes) {
        this.fiftyNotes=this.fiftyNotes-notes;
    }

    public void setTenNotes(int notes) {
        this.tenNotes=this.tenNotes-notes;
    }

}
