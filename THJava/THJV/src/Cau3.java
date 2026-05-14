
import java.util.Scanner;

public class Cau3{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a:");
        a = sc.nextInt();
        System.out.print("Nhap b:");
        b = sc.nextInt();
        System.out.print("Nhap c:");
        c = sc.nextInt();
        sc.close();
        if(laTamgiac(a,b,c)){
            System.out.println("La tam giac");
            if(laTamgiacdeu(a,b,c)){
                System.out.println("va con deu nua");
            }else{
                if(laTamgiacvuong(a,b,c)){
                System.out.println("va con vuong nua");
                }
                if(laTamgiaccan(a,b,c)){
                System.out.println("va con can nua");
                }
            }
        }else{
            System.out.println("Ko phai tam giac");
        }
    }
    public static boolean laTamgiac(int a, int b, int c){
        return((a+b)>c &&(a+c)>b && (b+c)>a);
    }

    public static boolean laTamgiacvuong(int a, int b, int c){
        return((a*a + b*b) == c*c ||(a*a + c*c) == b*b || (c*c + b*b) == a*a);
    }

    public static boolean laTamgiaccan(int a, int b, int c){
        return(a==b || b==c || c==a);
    }
    
    public static boolean laTamgiacdeu(int a, int b, int c){
        return(a==b && b==c);
    }
    
}