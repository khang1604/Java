
public class BankAccount {
    // Chỉ truy cập được trong lớp BankAccount
    private String accountNumber;
    private double balance;
    private String pin;

    public BankAccount(String accountNumber, double initialBalance, String pin) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.pin = pin;
    }

    // Phương thức private - chỉ dùng nội bộ
    private boolean validatePin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    // Phương thức private để mã hóa dữ liệu
    private String encryptData(String data) {
        return new StringBuilder(data).reverse().toString();
    }

    // Public method sử dụng private methods
    public boolean withdraw(double amount, String inputPin) {
        if (validatePin(inputPin)) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Rút " + amount + " thành công");
                return true;
            } else {
                System.out.println("Số dư không đủ");
                return false;
            }
        } else {
            System.out.println("Mã PIN không đúng");
            return false;
        }
    }

    // Getter public cho phép đọc dữ liệu private
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        // Trả về dữ liệu đã mã hóa
        return encryptData(accountNumber);
    }
}



class TestBankAccount {

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

