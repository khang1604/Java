import java.util.Scanner;

public class Cau10{
    public static boolean KTnamnhuan(int year){
        return((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam can kiem tra: ");
        n = sc.nextInt();
        System.out.println(KTnamnhuan(n)? n+" la nam nhuan" : n+" khong phai la nam nhuan");
        sc.close();
    }
}