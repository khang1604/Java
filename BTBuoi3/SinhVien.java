class SinhVien {
    private String name;
    private int age;

    //Constructor
    public SinhVien(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){// Override toString
        return "SinhVien{name='"+name+ "',age="+age+"}";
    }

    // Getter và Setter
    public void setName(String name) {
        this.name = name;
    }
}
class Main {
    public static void main(String[] args) {
    SinhVien s1 = new SinhVien("An", 20);
    SinhVien s2 = s1;
    // Thay đổi tên ở s2
    s2.setName("Bình");
    System.out.println("Gốc s1: " + s1);
    System.out.println("Bản sao s2: " + s2);
    }
}
