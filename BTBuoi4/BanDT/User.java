
 public class User {
    private int userId;
    private String username;
    private String password;
    private String role;

    public boolean login(String u, String p) {
        // So sánh username và password
        if (this.username != null && this.username.equals(u) && 
            this.password != null && this.password.equals(p)) {
            return true;
        }
        return false;
    }

    public void updateProfile(String name, String email) {
        // Cập nhật thông tin profile
        // (Sơ đồ không có thuộc tính email và name riêng biệt, 
        // nhưng phương thức yêu cầu cập nhật nên có thể thêm logic tùy biến ở đây)
    }

    public String getRole() {
        return this.role;
    }
}