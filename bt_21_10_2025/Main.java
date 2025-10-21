import models.NhanVienSanXuat;
import models.NhanVienVanPhong;

public class Main {
    public static void main(String[] args) {
        NhanVienVanPhong nvvp = new NhanVienVanPhong(
            "NV001",             
            "Nguyễn Văn A",      
            8000000,             
            true,               
            3                    
        );

        NhanVienSanXuat nvsx = new NhanVienSanXuat(
            "NV002", 
            "Trần Thị B", 
            9000000, 
            false, 
            1500000
        ) {
            @Override
            public double tinhLuong() {
                double luong = getLuongCoBan() + getPhuCapCoDinh();
                return apDungThuong(isThuong(), luong);
            }
        };

        System.out.println("===== THÔNG TIN NHÂN VIÊN =====");
        System.out.println("Nhân viên văn phòng:");
        System.out.println(nvvp.toString());
        System.out.println("→ Lương thực nhận: " + nvvp.tinhLuong());

        System.out.println("\nNhân viên sản xuất:");
        System.out.println(nvsx.toString());
        System.out.println("→ Lương thực nhận: " + nvsx.tinhLuong());
    }
}
