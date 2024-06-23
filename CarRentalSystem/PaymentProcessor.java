package model.payment;

public interface PaymentProcessor {
    boolean processPayment(double amount);  
}
