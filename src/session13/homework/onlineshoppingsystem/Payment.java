package session13.homework.onlineshoppingsystem;

public class Payment {

    private String paymentMethod;
    private double paymentAmount;
    private String paymentStatus;

    public Payment(String paymentMethod, double paymentAmount) {
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
        this.paymentStatus = "Pending"; // Default status
    }

    public void processPayment() {
    }
}