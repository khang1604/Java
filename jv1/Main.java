import java.util.Scanner;

public class Main{
    int b=1;//Đây là biến thuộc về một đối tượng (instance) của lớp Main. Nó chỉ tồn tại khi bạn đã tạo đối tượng bằng từ khóa new.
    static int sum(int a, int b){
        return a + b;

    }

    // Hàm tính a^b (với b là số nguyên không âm)
    static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
    
    public static void main(String[] args ){
        
        Car BMW = new Car(1999, "yellow");
        System.out.println("Năm sản xuất: " + BMW.Year);
        System.out.println("Màu xe: " + BMW.Color);

        // Khởi tạo Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị cho N: ");
        int inputN = scanner.nextInt();
        System.out.println("Bạn vừa nhập N = " + inputN);
        
        scanner.close(); // Đóng scanner khi không sử dụng nữa để giải phóng tài nguyên
        }

}
