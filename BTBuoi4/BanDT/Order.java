
 import java.util.Date;

public class Order {
    private String orderId;
    private Date orderDate;
    private String status;

    public void createOrder() {
        // Logic tạo đơn hàng mới
        this.orderDate = new Date(); // Lấy ngày giờ hiện tại
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public void printInvoice() {
        // Logic in hóa đơn
        System.out.println("Printing invoice for Order: " + this.orderId);
    }
}