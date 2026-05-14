
import java.util.Scanner;

public class Cau15{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N: ");
        n = sc.nextInt();
        inTamgiacVuong(n);
        System.out.println();
        inTamgiacCan(n);
        sc.close();
    }
    public static void inTamgiacVuong(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inTamgiacCan(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}

