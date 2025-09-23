import sinhvien.SinhVien;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("SV001", "Nguyen Van A", 20);
        SinhVien sv2 = new SinhVien("SV002", "Tran Thi B", 21);

        SinhVien sv3 = new SinhVien();
        sv3.nhapThongTin();


        sv1.display();
        sv2.display();
        sv3.display();
        SinhVien.hienThiTongSoSV();
    }
}
