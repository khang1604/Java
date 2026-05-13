
public class Cart {
    private int cartId;
    private double totalAmount;

    public void addItem(Product p, int qty) {
        // Logic thêm sản phẩm vào giỏ hàng sẽ được triển khai ở đây
    }

    public void removeItem(int productId) {
        // Logic xóa sản phẩm khỏi giỏ hàng sẽ được triển khai ở đây
    }

    public double calculateTotal() {
        // Logic tính toán tổng tiền
        return this.totalAmount;
    }
}