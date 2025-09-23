package sinhvien;

import java.util.Scanner;

public class SinhVien {
    private String mSV;
    private String hoTen;
    private int tuoi;

    private static int countSV = 0;

    public SinhVien(String mSV, String hoTen, int tuoi) {
        this.mSV = mSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        countSV++;
    }

    public SinhVien() {
        countSV++;
    }

    public SinhVien nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        mSV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        return this; 
    }

    public void display() {
        System.out.println("Ma SV: " + mSV + ", Ho ten: " + hoTen + ", Tuoi: " + tuoi);
    }

    public static void hienThiTongSoSV() {
        System.out.println("Tong so sinh vien da tao: " + countSV);
    }
}
