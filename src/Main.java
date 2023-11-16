import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create some sample customers
        Customer customer1 = new Customer(1, "Nikhila J", "nikki.j@gmail.com");

        // Create some sample products
        Product product1 = new Product(101, "Laptop", 999.99, 50);
        Product product2 = new Product(102, "Smartphone", 499.99, 100);

        // Create an order with the sample customer and products
        List<Product> orderProducts = new ArrayList<>();
        orderProducts.add(product1);
        orderProducts.add(product2);

        Order order = new Order(1001, customer1, orderProducts);

        // Display information about the order
        System.out.println("Order Details:");
        System.out.println(order);

        // Perform operations, e.g., update quantity available for a product
        product1.setQuantityAvailable(40);

        // Display updated product information
        System.out.println("\nUpdated Product Information:");
        System.out.println(product1);

        // Simulate a payment for the order
        Payment payment = new Payment(2001, order, order.getTotalAmount());

        // Display information about the payment
        System.out.println("\nPayment Details:");
        System.out.println(payment);
    }
}
