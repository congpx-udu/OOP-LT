package order;

import java.util.ArrayList;
import java.util.List;
import model.Customer;
import model.Product;
import payment.PaymentMethod;

public class Order {
    private final Customer customer;
    private final List<Product> items = new ArrayList<>();
    private PaymentMethod paymentMethod;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product p) { 
        items.add(p); 
    }
    public void setPaymentMethod(PaymentMethod pm) { 
        this.paymentMethod = pm; 
    }

    public double getTotal() {
        return items.stream().mapToDouble(Product::getGiaSP).sum();
    }

    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Đơn hàng trống.");}
        if (paymentMethod == null) {
            System.out.println("Chưa chọn phương thức thanh toán.");
        }
        paymentMethod.pay(customer.getTenKH(), getTotal());
    }
}
