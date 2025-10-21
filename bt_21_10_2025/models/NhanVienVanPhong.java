package models;

public class NhanVienVanPhong extends NhanVien implements ThuongThem {
    private int soSPVuotDinhMuc;

    public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan, boolean thuong, int soSPVuotDinhMuc) {
        super(maNV, hoTen, luongCoBan, thuong);
        this.soSPVuotDinhMuc = soSPVuotDinhMuc;
    }

    public NhanVienVanPhong() {
        super();
        this.soSPVuotDinhMuc = 0;
    }

    @Override
    public double tinhLuong() {
        double luong = getLuongCoBan() + soSPVuotDinhMuc*200000;
        return apDungThuong(isThuong(), luong);
    }

    @Override
    public double apDungThuong(boolean thuong, double luong) {
        return thuong ? luong * 1.05 : luong;
    }

    public double getSoSPVuotDinhMuc() {
        return soSPVuotDinhMuc;
    }

    public void setSoSPVuotDinhMuc(int soSPVuotDinhMuc) {
        this.soSPVuotDinhMuc = soSPVuotDinhMuc;
    }
}
