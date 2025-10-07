package model;

public class ElectronicProduct extends Product {
    private final String imei;
    private final int baoHanh;

    public ElectronicProduct(String maSP , String tenSP, double giaSP, String imei, int baoHanh) {
        super(maSP, tenSP, giaSP);
        this.imei = imei;
        this.baoHanh = baoHanh;
    }

    public String getImei() { return imei; }
    public int getBaoHanh() { return baoHanh; }
}
