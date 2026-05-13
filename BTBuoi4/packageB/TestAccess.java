package  Java.BTBuoi4.packageB;
import packageA.PackageHelper;  // Lỗi! Không thể import vì là default

public class TestAccess {
   public static void main(String[] args) {
       PackageHelper helper = new PackageHelper(); // Lỗi! Không truy cập được
       System.out.println("Không thể truy cập lớp default từ package khác");
   }
}
