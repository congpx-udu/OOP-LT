package payment;

public class MomoPayment implements PaymentMethod {
    private final String phoneNumber;

    public MomoPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(String tenKH, double amount) {
        System.out.println("Khách hàng: " + tenKH +
                ". Tổng tiền: " + format(amount) +
                ". Thanh toán qua ví MoMo (" + phoneNumber + ") thành công.");
    }

    private String format(double amount) {
        return String.format("%,.0f₫", amount);
    }
}
