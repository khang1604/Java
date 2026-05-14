import java.util.Scanner;

public class Cau5{
    public static void giaiPTB1(int a, int b){
        if(a==0){
            if(b==0){
                System.out.println("PT vo so nghiem");
            }
            if(b!=0){
                System.out.println("PT vo nghiem");
            }
        }
        else{
            double x = (double) -b / a;
            System.out.println("PT co nghiem duy nhat x= -"+b+"/"+a+" = "+x);
        }
    }
    public static void main(String[] args) {
        int a,b;
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
