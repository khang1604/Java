
import java.util.Random;
import java.util.Scanner;

public class Main{


    //Bai1
    int sumSn(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }

    //Bai2
    void inUocN(int n){
        for(int i=1; i<=n;i++){
            if(n%i == 0){
                System.out.println("Uoc N: "+i);
            }
        }
    }

    //Bai3
    int TongUocN(int n){
        int Sum=0;
        for(int i=1; i<=n;i++){
            if(n%i == 0){
                Sum+=i;
            }
        }
        return Sum;
    }

    //Bai4
    int TongUocChanN(int n){
        int Sum=0;
        for(int i=1; i<=n;i++){
            if(n%i == 0 && i % 2 ==0){
                Sum+=i;
            }
        }
        return Sum;
    }

    // double random(int n){
    //     double d = Math.random();
    //     // return (double)(Math.random()*n);
    //     return d;
    // }
    int randATOb(int a, int b){
        Random rd = new Random();
        int range = (b - a)+1;
        int val = a+rd.nextInt(range);
        return val;
    }



    public static void main(String[] args){
        Main bt = new Main();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = in.nextInt();

        System.out.println("Tong tu 1 den N la "+ bt.sumSn(n));
        bt.inUocN(n);
        System.out.println("Tong uoc N la "+ bt.TongUocN(n));
        System.out.println("Tong uoc chan N la "+ bt.TongUocChanN(n));
        System.out.println(bt.randATOb(5, 10));
    }
}