package taikhoan;

public class TaiKhoan {
    private String soTK;
    private String chuTK;
    private double soDu;

    private static double laiSuatNam = 0.06;

    public TaiKhoan(String soTK, String chuTK, double soDu) {
        this.soTK = soTK;
        this.chuTK = chuTK;
        this.soDu = soDu;
    }

    public void napTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Nap thanh cong " + soTien + " vao tai khoan " + soTK);
        } else {
            System.out.println("So tien nap phai > 0");
        }
    }

    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rut thanh cong " + soTien + " tu tai khoan " + soTK);
        } else {
            System.out.println("Rut tien that bai (so du khong du hoac so tien <= 0)");
        }
    }

    public void tinhLaiMotThang() {
        double lai = soDu * (laiSuatNam / 12);
        soDu += lai;
        System.out.println("Tinh lai 1 thang cho " + soTK + ": +" + lai);
    }

    public void hienThiThongTin() {
        System.out.printf("So TK: %s | Chu TK: %s | So du: %.2f%n", soTK, chuTK, soDu);
    }

    public static void thayDoiLaiSuat(double laiSuatMoi) {
        if (laiSuatMoi > 0) {
            laiSuatNam = laiSuatMoi;
            System.out.println("Da thay doi lai suat nam thanh: " + laiSuatNam);
        } else {
            System.out.println("Lai suat phai > 0");
        }
    }

    public static void hienThiLaiSuat() {
        System.out.println("Lai suat hien tai: " + laiSuatNam);
    }

    public String getSoTK() {
        return soTK;
    }

    public double getSoDu() {
        return soDu;
    }
}
