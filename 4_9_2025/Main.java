import rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        Rectangle rect = new Rectangle(x, y);
        System.out.println(rect.tinhChuVi(x, y));
        System.out.println(rect.tinhDienTich(x, y));
    }
    
    
}
