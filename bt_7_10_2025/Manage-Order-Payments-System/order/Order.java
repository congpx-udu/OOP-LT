package order;

import java.util.ArrayList;
import java.util.List;
import model.Product;
import payment.PaymentMethod;

public class Order {
    private final String tenKH;
    private final List<Product> items = new ArrayList<>();
    private PaymentMethod paymentMethod;

    public Order(String tenKH) {
        if (tenKH == null || tenKH.isBlank()) {
            throw new IllegalArgumentException("Tên khách hàng không được để trống");
        }
        this.tenKH = tenKH;
    }

    public void addProduct(Product p) {
        if (p == null) {
            throw new IllegalArgumentException("Sản phẩm không được null");
        }
        items.add(p);
    }

    public void setPaymentMethod(PaymentMethod pm) {
        if (pm == null) {
            throw new IllegalArgumentException("Phương thức thanh toán không được null");
        }
        this.paymentMethod = pm;
    }

    public double getTotal() {
        double sum = 0;
        for (Product item : items) {
            sum += item.getGiaSP();
        }
        return sum;
    }

    public void checkout() {
        if (items.isEmpty()) throw new IllegalStateException("Đơn hàng trống.");
        if (paymentMethod == null) throw new IllegalStateException("Chưa chọn phương thức thanh toán.");
        paymentMethod.pay(tenKH, getTotal());
    }
}
