package models;

public abstract class NhanVien {
    private String maNV;
    private String hoTen;
    private double luongCoBan;
    private boolean thuong;

    public NhanVien(String maNV, String hoTen, double luongCoBan, boolean thuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.thuong = thuong;
    }

    public NhanVien() {
        this("", "", 0, false);
    }

    public abstract double tinhLuong();

    public String getMaNV() { return maNV; }
    public void setMaNV(String maNV) { this.maNV = maNV; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public double getLuongCoBan() { return luongCoBan; }
    public void setLuongCoBan(double luongCoBan) { this.luongCoBan = luongCoBan; }

    public boolean isThuong() { return thuong; }
    public void setThuong(boolean thuong) { this.thuong = thuong; }
}
