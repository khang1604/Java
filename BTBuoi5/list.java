
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        // khai bao mang
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = 2*(i+1);//chỉ lấy các số chẵn
            
        }
        double[] vect = {1,6,8,4,2,3.5,6.9};
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]+" ");
            
        }
        //for each
        for(double var : vect){
            System.out.println(var +" ");
        }
        sc.close();
    }
}
