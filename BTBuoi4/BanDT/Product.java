
public class Product {
    private int productId;
    private String name;
    private String brand;
    private double price;
    private int stockQuantity;
    private String status;

    // Constructor
    public Product(int id, String name, double price, int stockQuantity, String status) {
        this.productId = id;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.status = status;
    }
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void updateStock(int qty) {
        this.stockQuantity += qty;
    }

    public void applyDiscount(double percentage) {
        this.price -= this.price * (percentage / 100);
    }

    public int getProductId() {
        return this.productId;
    }

    public int getStockQuantity() {
        return this.stockQuantity;
    }

    public void displayInfo() {
        System.out.println("ID: " + productId + " | Tên: " + name +
                        " | Giá: $" + price + " | Tồn kho: " + stockQuantity +
                        " | Trạng thái: " + status);
    }
}