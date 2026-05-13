public class Main{
     public static void main(String[] args) {

        BankAccount account = new BankAccount("1234567890", 1000.0, "9999");

        // Không thể truy cập biến private trực tiếp

        // account.balance = 5000; // Lỗi biên dịch!

        // account.pin = "0000"; // Lỗi biên dịch!

        // không thể gọi phương thức private trực tiếp

        // account.validatePin("9999"); // Lỗi biên dịch!

        // account.encryptData("1234567890"); // Lỗi biên dịch!

        // Chỉ truy cập qua phương thức public

        account.withdraw(500.0, "9999");

        System.out.println("Số dư: " + account.getBalance());

        System.out.println("Account: " + account.getAccountNumber());

    }
}
