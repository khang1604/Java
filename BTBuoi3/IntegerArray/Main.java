import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số lượng phần tử của mảng n = ");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        IntegerArray arr = new IntegerArray(a, n);
        
        System.out.println("Mời bạn nhập các phần tử cho mảng:");
        arr.inputArr();
        
        System.out.print("Mảng ban đầu: ");
        arr.outputArr();
        
        // System.out.println("\nMin: " + arr.getMinValue());
        // System.out.println("\nMax: " + arr.getMaxValue());
        // System.out.println("\nAvg: " + String.format("%.2f", arr.getAvg()));
        
        arr.sortAsc();
        System.out.print("\nMảng sau khi sắp xếp tăng dần: ");
        arr.outputArr();
        // System.out.println();
        
        sc.close();
    }
}