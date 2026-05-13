public class Main{

    static void Output_Arr(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //Câu 1 Sắp xếp tăng dần
    static void SapXepTangDan(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                swap(arr, i, j);
                }
            }
        }
    }


















    //Câu 2 Sắp xếp giảm dần
    static void SapXepGiamDan(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                swap(arr, i, j);
                }
            }
        }
    }











    //Câu 3
    static int Max_Arr(int[] arr){
        int Max = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i]>Max){
                Max = arr[i];
            }
        }
        return Max;
    }

    static void In_max(int[] arr){
        int Max = Max_Arr(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == Max ){
                System.out.print(i + " ");
            }
        }
    }

    //Câu 4
    static int[] RemoveAtX(int[] arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x) count++;
        }
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != x){
                newArr[index++] = arr[i];
            }
        }
        return newArr;
    }

    //Câu 5
    static int Min_Arr(int[] arr){
        int Min = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i]<Min){
                Min = arr[i];
            }
        }
        return Min;
    }

    static int[] insert_X(int[] arr, int x){
        int Min = Min_Arr(arr);
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == Min) count++;
        }
        int[] newArr = new int[arr.length + count];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == Min){
                newArr[index++] = x;
            }
            newArr[index++] = arr[i];
        }
        return newArr;
    }

    //Câu 6
    static int[] removeMax(int[] arr){
        int Max = Max_Arr(arr);
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == Max) count++;
        }
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != Max){
                newArr[index++] = arr[i];
            }
        }
        return newArr;
    }

    //Câu 7
    static void revesedArr(int[] arr){
        for(int i=0; i<arr.length/2; i++){
            swap(arr, i, arr.length-1-i);
        }
    }

    //Câu 8
    static boolean KT_DX(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] != arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 8, 2, 9, 1};
        System.out.println("Mảng ban đầu:");
        Output_Arr(arr1);
        
        System.out.println("\nCâu 1: Sắp xếp tăng dần");
        SapXepTangDan(arr1);
        Output_Arr(arr1);
        
        System.out.println("\nCâu 2: Sắp xếp giảm dần");
        SapXepGiamDan(arr1);
        Output_Arr(arr1);
        
        int[] arr3 = {1, 5, 9, 9, 2};
        System.out.println("\nCâu 3: In ra các phần tử lớn nhất");
        In_max(arr3);
        
        int[] arr4 = {3, 7, 3, 2, 8};
        System.out.println("\nCâu 4: Xoá phần tử x = 3");
        arr4 = RemoveAtX(arr4, 3);
        Output_Arr(arr4);
        
        int[] arr5 = {4, 1, 6, 1, 5};
        System.out.println("\nCâu 5: Chèn x = 9 vào trước phần tử nhỏ nhất");
        arr5 = insert_X(arr5, 9);
        Output_Arr(arr5);
        
        int[] arr6 = {8, 2, 8, 4};
        System.out.println("\nCâu 6: Xoá phần tử lớn nhất");
        arr6 = removeMax(arr6);
        Output_Arr(arr6);
        
        int[] arr7 = {1, 2, 3, 4, 5};
        System.out.println("\nCâu 7: Đảo ngược mảng");
        revesedArr(arr7);
        Output_Arr(arr7);
        
        int[] arr8_1 = {1, 2, 3, 2, 1};
        int[] arr8_2 = {1, 2, 3, 4, 5};
        System.out.println("\nCâu 8: Kiểm tra mảng đối xứng");
        System.out.println("Mảng {1, 2, 3, 2, 1} đối xứng? " + KT_DX(arr8_1));
        System.out.println("Mảng {1, 2, 3, 4, 5} đối xứng? " + KT_DX(arr8_2));
    }
}