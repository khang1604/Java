import java.util.Scanner;

public class Cau7{
    public static boolean KTsoCP(double n){
        double sqrt_n = Math.sqrt(n);
        return (sqrt_n*sqrt_n)==n;
    }
    public static void main(String[] args) {
        double n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        n = sc.nextInt();
        sc.close();
        System.out.println(KTsoCP(n)? (int)n+" la so chinh phuong": (int)n+" khong la so chinh phuong");
    }
}
