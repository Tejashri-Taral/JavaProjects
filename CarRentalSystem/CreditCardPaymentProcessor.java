package model.payment;

public class CreditCardPaymentProcessor implements PaymentProcessor{

    public boolean processPayment(double amount) {
        System.out.println("Amount: "+ amount+ " process successfully through Credit Card");
        return true;
    }

}
