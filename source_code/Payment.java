public class Payment {
    private int paymentId;
    private float amount;
    private String method;

    public Payment(int paymentId, float amount, String method) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.method = method;
    }

    public void processPayment() {
        System.out.println("Payment processed successfully with method: " + method);
    }

    
}
