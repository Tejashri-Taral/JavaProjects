public class User {
    private String userName;
    private String pin;
    private String accountNumber;
    private double balance;
    private int cvv;
    private int monthOfExpiry;
    private int yearOfExpiry;

    public User(String userName,String pin,String accountNumber,double balance,int cvv,int  monthOfExpiry,int yearOfExpiry) {
        this.userName=userName;
        this.pin=pin;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.cvv=cvv;
        this.monthOfExpiry=monthOfExpiry;
        this.yearOfExpiry=yearOfExpiry;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setName(String userName) {
        this.userName=userName;
    }

    public String getPin() {
        return this.pin;
    }

    public void setPin(String pin) {
        this.pin=pin;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber=accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance=balance;
    }

    public int getCvv() {
        return this.cvv;
    }

    public void setCvv(int cvv) {
        this.cvv=cvv;
    }

    public int getExpiryMonth() {
        return this.monthOfExpiry;
    }

    public void setMonthOfExpiry(int monthOfExpiry) {
        this.monthOfExpiry=monthOfExpiry;
    }

    public int getYearOfExpiry() {
        return this.yearOfExpiry;
    }

    public void setPassword(int yearOfExpiry) {
        this.yearOfExpiry=yearOfExpiry;
    }


}
