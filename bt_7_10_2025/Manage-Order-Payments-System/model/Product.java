package model;

public abstract class Product {
    private final String maSP;
    private final String tenSP;
    private final double giaSP;

    protected Product(String maSP, String tenSP, double giaSP) {
        
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
    }

    public String getMaSP() { 
        return maSP; 
    }
    public String getTenSP() { 
        return tenSP; 
    }
    public double getGiaSP() { 
        return giaSP; 
    }
}
