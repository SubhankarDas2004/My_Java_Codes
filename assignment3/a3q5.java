interface UPIPayment {
    void payViaUPI(double amount);
}

interface CardPayment {
    void payViaCard(double amount);
}

class OnlinePayment implements UPIPayment, CardPayment 
{
    String customerName;

    OnlinePayment(String customerName) {
        this.customerName = customerName;
    }

    public void payViaUPI(double amount) {
        System.out.println("Processing UPI Payment...");
        System.out.println("Customer: " + customerName);
        System.out.println("Amount Paid via UPI: $" + amount);
        System.out.println("UPI Transaction Successful");
    }

    public void payViaCard(double amount) {
        System.out.println("Processing Card Payment...");
        System.out.println("Customer: " + customerName);
        System.out.println("Amount Paid via Card: $" + amount);
        System.out.println("Card Transaction Successful");
    }
}

public class a3q5 
{
    public static void main(String[] args) {
        OnlinePayment payment = new OnlinePayment("John Doe");
        
        
        payment.payViaUPI(500);
        
        System.out.println("------X------");
        
        payment.payViaCard(1200);
    }
}