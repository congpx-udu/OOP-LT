package payment;

public class ZaloPayPayment implements PaymentMethod {
    private final String zaloAccount;

    public ZaloPayPayment(String zaloAccount) {
        this.zaloAccount = zaloAccount;
    }

    @Override
    public void pay(String tenKH, double amount) {
        System.out.println("Khách hàng: " + tenKH +
                ". Tổng tiền: " + format(amount) +
                ". Thanh toán qua ZaloPay (" + zaloAccount + ") thành công.");
    }

    private String format(double amount) {
        return String.format("%,.0f₫", amount);
    }
}
