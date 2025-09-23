import rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Vui lòng nhập 2 số nguyên!");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        Rectangle rect = new Rectangle(x, y);
        System.out.println("Chu vi: " + rect.tinhChuVi());
        System.out.println("Diện tích: " + rect.tinhDienTich());
    }
}
