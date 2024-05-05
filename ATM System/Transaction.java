import java.time.LocalDateTime;

public class Transaction {
    private long transactionID;
    private LocalDateTime dateOfTransaction;
    private TransactionType transactionType;
    private int transactionAmount;
    private Verdict verdict;
    private Location location;

    public Transaction(long transactionID,LocalDateTime dateOfTransaction,int transactionAmount,
    Verdict verdict,TransactionType transactionType,Location location) {
        this.transactionID=transactionID;
        this.dateOfTransaction=dateOfTransaction;
        this.transactionType=transactionType;
        this.transactionAmount=transactionAmount;
        this.verdict=verdict;
        this.location=location;
    }

    public long getTransactionId() {
        return this.transactionID;
    }

    public LocalDateTime getDateOfTransaction() {
        return this.dateOfTransaction;
    }

    public TransactionType getTransactionType() {
        return this.transactionType;
    }

    public int getTransactionAmount() {
        return this.transactionAmount;
    }

    public Verdict getVerdict() {
        return this.verdict;
    }

    public Location gatLocation() {
        return this.location;
    }


}
