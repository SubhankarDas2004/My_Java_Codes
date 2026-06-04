abstract class Payment {
    String transactionId;
    double amount;

    Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    abstract void processPayment();
}

class CreditCardPayment extends Payment {
    
    CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    void processPayment() {
        double fee = amount * 0.02;  
        double total = amount + fee;
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Payment Method: Credit Card");
        System.out.println("Amount: $" + amount);
        System.out.println("Transaction Fee: $" + fee);
        System.out.println("Total Charged: $" + total);
    }
}

class PayPalPayment extends Payment {

    PayPalPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    void processPayment() {
        double fee = amount * 0.03;  
        double total = amount + fee;
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Payment Method: PayPal");
        System.out.println("Amount: $" + amount);
        System.out.println("Transaction Fee: $" + fee);
        System.out.println("Total Charged: $" + total);
    }
}

public class a3q3 {
    public static void main(String[] args) 
    {

        CreditCardPayment cc = new CreditCardPayment("TXN101", 1000);
        cc.processPayment();
        
        System.out.println("------XXXXX------");
        
        // Process PayPal payment
        PayPalPayment pp = new PayPalPayment("TXN102", 500);
        pp.processPayment();
    }
}