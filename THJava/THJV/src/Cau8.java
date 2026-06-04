import java.util.Scanner;

public class Cau8{
    public static boolean KTnamnhuan(int year){
        return((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static void inSongaycuathang(int m){
        switch(m) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Thang "+m+" co 31 ngay");
                break;
            case 4, 6, 9, 11:
                System.out.println("Thang "+m+" co 30 ngay");
                break;
            case 2:
                int y;
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap nam can kiem tra: ");
                y = sc.nextInt();
                System.out.println(KTnamnhuan(y)? "Thang "+m+" co 29 ngay" : "Thang "+m+" co 28 ngay");
                sc.close();
                break;
            default:
                System.out.println("This month is invalid");
        }
    }
    
    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang can kiem tra: ");
        m = sc.nextInt();
        inSongaycuathang(m);
        sc.close();
    }
}
