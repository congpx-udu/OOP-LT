package model;

import java.time.LocalDate;

public class FoodProduct extends Product {
    private final LocalDate hanSD;

    public FoodProduct(String maSP, String tenSP, double giaSP, LocalDate hanSD) {
        super(maSP, tenSP, giaSP);
        this.hanSD = hanSD;
    }

    public LocalDate getHanSD() { return hanSD; }
}
