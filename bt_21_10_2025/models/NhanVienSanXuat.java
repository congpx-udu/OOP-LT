package models;

public class NhanVienSanXuat extends NhanVien implements ThuongThem {
    private double phuCapCoDinh;

    public NhanVienSanXuat(String maNV, String hoTen, double luongCoBan, boolean thuong, double phuCapCoDinh) {
        super(maNV, hoTen, luongCoBan, thuong);
        this.phuCapCoDinh = phuCapCoDinh;
    }

    public NhanVienSanXuat() {
        super();
        this.phuCapCoDinh = 1000000;
    }

    @Override
    public double tinhLuong() {
        double luong = getLuongCoBan() + phuCapCoDinh;
        return apDungThuong(isThuong(), luong);
    }

    @Override
    public double apDungThuong(boolean thuong, double luong) {
        return thuong ? luong * 1.05 : luong;
    }

    public double getPhuCapCoDinh() {
        return phuCapCoDinh;
    }

    public void setPhuCapCoDinh(double phuCapCoDinh) {
        this.phuCapCoDinh = phuCapCoDinh;
    }
}
