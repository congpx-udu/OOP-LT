import java.util.*;
import taikhoan.TaiKhoan;

public class Main {
    public static void main(String[] args) {
        List<TaiKhoan> dsTK = new ArrayList<>();

        dsTK.add(new TaiKhoan("1001", "Nguyen Van A", 5000));
        dsTK.add(new TaiKhoan("1002", "Tran Thi B", 10000));
        dsTK.add(new TaiKhoan("1003", "Le Van C", 2000));

        TaiKhoan.hienThiLaiSuat();

        dsTK.get(0).napTien(2000);
        dsTK.get(1).rutTien(3000);

        for (TaiKhoan tk : dsTK) {
            tk.tinhLaiMotThang();
        }

        TaiKhoan.thayDoiLaiSuat(0.08);
        TaiKhoan.hienThiLaiSuat();

        dsTK.sort((a, b) -> Double.compare(b.getSoDu(), a.getSoDu()));

        System.out.println("\n=== Danh sach tai khoan sau xu ly ===");
        for (TaiKhoan tk : dsTK) {
            tk.hienThiThongTin();
        }

        String soTKCanTim = "1002";
        Optional<TaiKhoan> ketQua = dsTK.stream()
                                       .filter(tk -> tk.getSoTK().equals(soTKCanTim))
                                       .findFirst();
        if (ketQua.isPresent()) {
            System.out.println("\nTim thay tai khoan " + soTKCanTim + ":");
            ketQua.get().hienThiThongTin();
        } else {
            System.out.println("\nKhong tim thay tai khoan " + soTKCanTim);
        }
    }
}
