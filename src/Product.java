public class Product {
    private int productId;
    private String name;
    private double price;
    private int quantityAvailable;

    public Product(int productId, String name, double price, int quantityAvailable) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantityAvailable=" + quantityAvailable +
                '}';
    }
}
