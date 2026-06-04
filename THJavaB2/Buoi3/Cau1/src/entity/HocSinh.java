package entity;
import java.util.Scanner;

public class HocSinh{
    private String MaSo;
    private String HoTen;
    private double DTB;

    public HocSinh(String ms, String ten, double tb) {
        this.MaSo = ms;
        this.HoTen = ten;
        this.DTB = tb;
    }

    public HocSinh() {
        this.MaSo = null;
        this.HoTen = null;
        this.DTB = 0;
    }

    public HocSinh(HocSinh tmp){
        this.MaSo = tmp.MaSo;
        this.HoTen = tmp.HoTen;
        this.DTB = tmp.DTB;
    }

    public void setMaSo(String ms){
        this.MaSo = ms;
    }

    public String getMaSo(){
        return this.MaSo;
    }

    public void setHoTen(String ten){
        this.HoTen = ten;
    }

    public String getHoTen(){
        return this.HoTen;
    }

    public void setDTB(double tb){
        this.DTB = tb;
    }

    public double  getDTB(){
        return this.DTB;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hoc sinh: ");
        MaSo = sc.next();
        sc.nextLine();
        System.out.print("Nhap ho ten hoc sinh: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap DTB hoc sinh: ");
        DTB = sc.nextDouble();
        sc.close();
    }

    public void output(){
        System.out.println("Ma HS: "+MaSo+" | Ho Ten: "+HoTen+" | DTB: "+DTB);
    }
}
