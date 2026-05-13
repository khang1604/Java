package Java.BTBuoi4.packageA;
// Lớp này chỉ truy cập được trong packageA
class PackageHelper {
   // Thuộc tính default - chỉ truy cập trong package
    String helperName = "Package Helper";
    int helperId = 100;

    // Phương thức default
    void displayInfo() {
        System.out.println("Helper: " + helperName + ", ID: " + helperId);
    }

    // Phương thức default
    String formatMessage(String msg) {
        return "[" + helperName + "] " + msg;
    }
}
