
import entity.HocSinh;

public class Main{
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();
        hs1.input();
        hs1.output();
        HocSinh hs2 = new HocSinh("11A1011","Nguyen Ngoc Lan", 9.67);
        hs2.output();
        HocSinh hs3 = new HocSinh(hs2);
        hs3.output();
        hs3.setHoTen("Phan Chau Tuan");
        hs3.output();

        double max =hs1.getDTB();
        String ht = hs1.getHoTen();
        if(max < hs2.getDTB()){
            max = hs2.getDTB();
            ht = hs2.getHoTen();
        }
        if(max < hs3.getDTB()){
            max = hs3.getDTB();
            ht = hs3.getHoTen();
        }
        System.out.println("Hoc sinh "+ht+" co DTB lon nhat la: "+max);
    }
}