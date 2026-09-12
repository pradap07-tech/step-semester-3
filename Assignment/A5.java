package Assignment;
class Payment {
    public void pay(double amount) {
        System.out.println("Paid (cash): Rs " + amount);
    }
}
class CardPayment extends Payment {
    public void payWithProcessingFee(double amount) {
        double totalAmount = amount * 1.02; // Adding 2% processing fee
        System.out.println("Charged (card, incl. fee): Rs " + totalAmount
);    }
}
int processTransaction(Payment payment, double amount) {
    if (payment instanceof CardPayment) {
        return ((CardPayment) payment).payWithProcessingFee(amount);
    } else {
        payment.pay(amount);
        return (int) amount; // Return the amount paid in cash
    }
}

public class A5 {
    public static void main(String[] args) {
        Payment[] payments = {
            new CardPayment(),
            new Payment(),
            new CardPayment(),
            new Payment(),
            new CardPayment()
        };

        double[] amounts = {100, 50, 200, 75, 120};
        double totalCollected = 0;

        for (int i = 0; i < payments.length; i++) {
            totalCollected += processTransaction(payments[i], amounts[i]);
        }

        System.out.println("Total Collected: Rs " + totalCollected);
    }
}
