import java.util.Scanner;

public class IntegerArray{
    public int[] arr;
    public int n;
    public IntegerArray(int[] arr, int n){
        this.arr = arr;
        this.n = n;
    }
    public void inputArr(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            this.arr[i] = sc.nextInt();
        }
    }
    //output arr
    public void outputArr(){   
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // //geter setter
    // public int[] getArr() {
    //     return arr;
    // }
    // public void setArr(int[] arr) {
    //     this.arr = arr;
    // }
    // public int getN() {
    //     return n;
    // }
    // public void setN(int n) {
    //     this.n = n;
    // }
    
    // //Min
    // public int getMinValue(){
    //     if (n == 0) return 0;
    //     int min = arr[0];
    //     for (int i = 1; i < n; i++) { 
    //         if (min > arr[i]) {
    //             min = arr[i];
    //         }
    //     }
    //     return min;
    // }

    //Max
    // public int getMaxValue(){
    //     if (n == 0) return 0;
    //     int max = arr[0];
    //     for (int i = 1; i < n; i++) {
    //         if (max < arr[i]) {
    //             max = arr[i];
    //         }
    //     }
    //     return max;
    // }










    //Avg
    // public double getAvg(){
    //     if (n == 0) return 0;
    //     double avg = 0;
    //     for (int i = 0; i < n; i++) {
    //         avg += arr[i];
    //     }
    //     return avg/n;
    // }











    //Sort Asc
    public void sortAsc(){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
}