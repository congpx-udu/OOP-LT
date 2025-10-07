package payment;

public class CreditCardPayment implements PaymentMethod {
    private final String maskedCard;

    public CreditCardPayment(String maskedCard) {
        this.maskedCard = maskedCard;
    }

    @Override
    public void pay(String tenKH, double amount) {
        System.out.println("Khách hàng: " + tenKH +
                ". Tổng tiền: " + format(amount) +
                ". Thanh toán bằng thẻ tín dụng (" + maskedCard + ") thành công.");
    }

    private String format(double amount) {
        return String.format("%,.0f₫", amount);
    }
}
