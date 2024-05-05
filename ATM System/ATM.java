import java.util.*;

public class ATM {
    private String Atm_Id;
    private Location location;
    private CurrencyComposition composition;
    private long balance;
    private Condition condition;
    private List<Transaction> transaction=new ArrayList<>();
    

    public ATM(String Atm_Id,Location location,CurrencyComposition composition) {
        this.Atm_Id=Atm_Id;
        this.location=location;
        this.composition=composition;
        condition=Condition.WORKING;
        this.balance=getBalance(composition);
        
    }

    public void setLocation(Location location) {
        this.location=location;
    }

    public void setCurrencyComposition(CurrencyComposition composition) {
        this.composition=composition;
    }

    private long getBalance(CurrencyComposition composition) {
        return composition.getFiveHundredNote()*500 + composition.getTwoHundredNote()*200 +composition.getOneHundredNote()*100 
        + composition.getFiftyNote()*50 +composition.getTenNote()*10 ;
    }

    public String getAtmId() {
        return this.Atm_Id;
    }

    public Location getLocation() {
        return this.location;
    }

    public CurrencyComposition getCurrencyComposition() {
        return this.composition;
    }

    public long getBalance() {
        return this.balance;
    }

    public Condition getCondition() {
        return this.condition;
    }

    public List<Transaction> getTransaction() {
        return this.transaction;
    }


}
