public class Payment {
    private int paymentId;
    private Order order;
    private double amount;
    private String paymentStatus;

    public Payment(int paymentId, Order order, double amount) {
        this.paymentId = paymentId;
        this.order = order;
        this.amount = amount;
        this.paymentStatus = "Pending"; // Default status
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", order=" + order +
                ", amount=" + amount +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
}
}
