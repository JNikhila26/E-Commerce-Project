import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;
    private double totalAmount;

    public Order(int orderId, Customer customer, List<Product> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
        this.calculateTotalAmount();
    }

    private void calculateTotalAmount() {
        this.totalAmount = calculateTotalPrice();
    }

    private double calculateTotalPrice() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", products=" + products +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
