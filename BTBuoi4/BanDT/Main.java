
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Cau 1
        Product[] products = new Product[5];
        products[0] = new Product(101, "Laptop Gaming", 1200.50, 10, "Active");
        products[1] = new Product(102, "Điện thoại Xiaomi", 350.00, 50, "Inactive");
        products[2] = new Product(103, "Tai nghe Bluetooth", 45.00, 100, "Active");
        products[3] = new Product(104, "Bàn phím cơ", 80.00, 30, "Active");
        products[4] = new Product(105, "Chuột không dây", 25.50, 0, "Inactive");
        //Cau 2
        for(Product p : products){
            p.displayInfo();
        }

        // Cau 3
        System.out.println("\n=== CẬP NHẬT GIÁ SẢN PHẨM ===");
        System.out.print("Nhập mã sản phẩm (productId) cần cập nhật giá: ");
        int updateId = scanner.nextInt();
        boolean CheckUpdate = false;

        for (Product p : products) {
            if (p.getProductId() == updateId) {
                System.out.print("Nhập giá mới cho sản phẩm này: ");
                double newPrice = scanner.nextDouble();
                p.setPrice(newPrice);
                System.out.println("Cập nhật thành công! Thông tin mới:");
                p.displayInfo();
                CheckUpdate = true;
                break;
            }
        }
        if (!CheckUpdate) {
            System.out.println("Không tìm thấy sản phẩm với mã ID: " + updateId);
        }


        
        //Cau 4
        System.out.println("\n=== TÌM KIẾM SẢN PHẨM ===");
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        int searchId = scanner.nextInt();
        boolean CheckSearch = false;

        for (Product p : products) {
            if (p.getProductId() == searchId) {
                System.out.println("Đã tìm thấy sản phẩm:");
                p.displayInfo();
                CheckSearch = true;
                break;
            }
        }
        if (!CheckSearch) {
            System.out.println("Không tìm thấy sản phẩm với mã ID: " + searchId);
        }


        //Cau 5
        System.out.println("\n=== TỔNG GIÁ TRỊ TỒN KHO ===");
        double Sum = 0;
        for (Product p : products) {
            Sum += (p.getPrice() * p.getStockQuantity());
        }
        System.out.println("Tổng giá trị các sản phẩm trong kho là: $" + Sum);
        scanner.close();
    }
}
