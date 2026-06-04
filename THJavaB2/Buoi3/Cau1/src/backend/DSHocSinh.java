package backend;

import entity.*;
import java.util.Scanner;

public class DSHocSinh {
    private HocSinh ds[];
    private int soluong;

    public void NhapDS(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        soluong = sc.nextInt();
        ds = new HocSinh[soluong];
        
        for(int i = 0; i < soluong; i++){
            System.out.println("--- Nhap thong tin hoc sinh thu " + (i + 1) + " ---");
            ds[i] = new HocSinh();
            ds[i].input();
        }
        sc.close();
    }

    public void XuatDS() {
        System.out.println("--- Danh sach hoc sinh ---");
        for (int i = 0; i < soluong; i++) {
            ds[i].output();
        }
    }

    public void SapXepGiamDan() {
        for (int i = 0; i < soluong - 1; i++) {
            for (int j = i + 1; j < soluong; j++) {
                if (ds[i].getDTB() < ds[j].getDTB()) {
                    HocSinh temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }
}
