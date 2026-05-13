public class Test {
    static void Output_Arr(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
   static int[] RemoveAtX(int[] arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(i == x) count++;
        }
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(i != x){
                newArr[index++] = i;
            }
        }
        return newArr;
    }
public static void main(String[] args) {
        int[] arr4 = {3, 7, 3, 2, 8};
        System.out.println("Mảng ban đầu:");
        Output_Arr(arr4);

        System.out.println("\nCâu 4: Xoá phần tử x = 3");
        arr4 = RemoveAtX(arr4, 3);
        Output_Arr(arr4);
}
}