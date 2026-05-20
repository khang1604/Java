import java.util.Scanner;

public class Cau2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so nguyen:");
        int n = sc.nextInt();
        System.out.println("so ban vua nhap la "+n);

        System.out.println("Nhap so thuc kieu float:");
        float f = sc.nextFloat();
        System.out.println("so ban vua nhap la "+f);

        System.out.println("Nhap so thuc double:");
        double d = sc.nextDouble();
        System.out.println("so ban vua nhap la "+d);

        System.out.println("Nhap 1 chuoi:");
        String str = sc.next();
        System.out.println("chuoi ban vua nhap la "+str);
        sc.close();

    }
}