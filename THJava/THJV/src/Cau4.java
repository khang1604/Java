
import java.util.Scanner;

public class Cau4{
    

    public static void main(String[] args) {
        String c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ki tu bat ki: ");
        c = sc.next();
        KTkitu(c);
        sc.close();
    }
    public static  int getUnicode(String c){
        return c.codePointAt(0);
    }

    public static void KTkitu(String c){
        int unicode = getUnicode(c);

        if(unicode >= 65 && unicode <= 90){
            System.out.println("CHU HOA");
        } else if (unicode >= 97 && unicode <= 122) {
            System.out.println("CHU THUONG");
        } else if (unicode >= 48 && unicode <= 57) {
            if (unicode % 2 == 0) {
                System.out.println("SO CHAN");
            } else {
                System.out.println("SO LE");
            }
        } else {
            System.out.println("KI TU KHAC");
        }
    }
}
