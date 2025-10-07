
import java.time.LocalDate;
import model.*;
import order.Order;
import payment.*;

public class App {
    public static void main(String[] args) {
        Product iphone = new ElectronicProduct("P001", "iPhone 15", 18_990_000, "351234567890123", 12);
        Product tv = new ElectronicProduct("P002", "Smart TV 55\"", 9_900_000, "359876543210987", 24);
        Product milk = new FoodProduct("F001", "Sữa tươi 1L", 38_000, LocalDate.now().plusDays(10));
        Product beef = new FoodProduct("F002", "Thịt bò 500g", 155_000, LocalDate.now().plusDays(3));

        Order order1 = new Order(new Customer("Nguyễn Văn A"));
        order1.addProduct(milk);
        order1.addProduct(beef);
        order1.setPaymentMethod(new CashPayment());
        order1.checkout();

        Order order2 = new Order(new Customer("Nguyễn Văn B"));
        order2.addProduct(iphone);
        order2.addProduct(tv);
        order2.setPaymentMethod(new CreditCardPayment("**** **** **** 4321"));
        order2.checkout();

        Order order3 = new Order(new Customer("Trần Thị C"));
        order3.addProduct(tv);
        order3.setPaymentMethod(new MomoPayment("0903 123 456"));
        order3.checkout();

        Order order4 = new Order(new Customer("Phạm D"));
        order4.addProduct(milk);
        order4.setPaymentMethod(new ZaloPayPayment("ZLP-8472"));
        order4.checkout();
    }
}
