import java.util.Scanner;

public class Sum{
    static int Sum(int n){
        int Sum=0;
        for (int i = 0; i < n; i++) {
            Sum+=i;
        }
        return Sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int N = input.nextInt();
        System.out.println("Tong tu 1 den N: "+ Sum(N));

    }
}