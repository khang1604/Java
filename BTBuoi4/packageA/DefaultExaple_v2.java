package Java.BTBuoi4.packageA;
class DefaultExaple_v2 {
    void testDefault() {
        // Truy cập được vì cùng package
        PackageHelper helper = new PackageHelper();
        System.out.println(helper.helperName); // OK
        helper.displayInfo(); // OK
        System.out.println(helper.formatMessage("Xin chào")); // OK
    }
    
}
