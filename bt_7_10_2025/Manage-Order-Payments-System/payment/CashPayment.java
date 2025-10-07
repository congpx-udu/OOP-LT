package payment;

public class CashPayment implements PaymentMethod {
    @Override
    public void pay(String tenKH, double amount) {
        System.out.println("Khách hàng: " + tenKH +
                ". Tổng tiền: " + format(amount) +
                ". Thanh toán tiền mặt thành công.");
    }

    private String format(double amount) {
        return String.format("%,.0f₫", amount);
    }
}
