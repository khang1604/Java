import java.util.Scanner;

public class Cau5{
    public static void giaiPTB1(double a, double b){
        if(a==0){
            if(b==0){
                System.out.println("PT vo so nghiem");
            }
            if(b!=0){
                System.out.println("PT vo nghiem");
            }
        }
        else{
            double x = -b / a;
            System.out.println("PT co nghiem duy nhat x= -"+(int)b+"/"+(int)a+" = "+x);
        }
    }
    public static void main(String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 so a va b: ");
        System.out.print("a= ");
        a = sc.nextInt();
        System.out.print("b= ");
        b = sc.nextInt();
        giaiPTB1(a, b);
        sc.close();
    }
}
