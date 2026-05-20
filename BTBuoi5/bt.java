public class bt{
    public static void main(String[] args) {
        int a[]  = {3,7,8,45,6,4,3,67,9,9};
        int b[] = new int[10];
        
        // Gán (sao chép) từng phần tử từ mảng a sang mảng b
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        int n = 10;
        for(int i=0; i<a.length; i++){
            a[i]=n;
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        for(int j=0; j<b.length; j++){
            System.out.print(b[j]+ " ");
        }
        
    }
}
