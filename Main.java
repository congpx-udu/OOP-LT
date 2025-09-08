import java.util.Scanner;

public class Main {

    public static int ChuVi(int x, int y) {
        return 2 * (x + y);
    }

    public static int DienTich(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println(ChuVi(x, y));
            System.out.println(DienTich(x, y));
        }
        sc.close();
    }
}
